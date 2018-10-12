package snownee.cuisine.tiles;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ITickable;
import snownee.cuisine.CuisineConfig;
import snownee.cuisine.api.process.BasinInteracting.Output;
import snownee.cuisine.api.process.Boiling;
import snownee.cuisine.api.process.Processing;
import snownee.cuisine.util.StacksUtil;

public class TileBasinHeatable extends TileBasin implements ITickable
{
    public static final Map<Block, Integer> BLOCK_HEAT_SOURCES = new HashMap<>();
    public static final Map<IBlockState, Integer> STATE_HEAT_SOURCES = new HashMap<>();
    private int tickCheckHeating = 0;
    protected boolean invLock = false;
    protected boolean failed = false;

    static
    {
        BLOCK_HEAT_SOURCES.put(Blocks.LIT_PUMPKIN, 1);
        BLOCK_HEAT_SOURCES.put(Blocks.TORCH, 1);
        BLOCK_HEAT_SOURCES.put(Blocks.LIT_FURNACE, 2);
        BLOCK_HEAT_SOURCES.put(Blocks.FIRE, 3);
        BLOCK_HEAT_SOURCES.put(Blocks.MAGMA, 3);
        BLOCK_HEAT_SOURCES.put(Blocks.LAVA, 4);
        BLOCK_HEAT_SOURCES.put(Blocks.FLOWING_LAVA, 4);
    }

    @Override
    public void update()
    {
        if (!world.isRemote && !failed && tank.getFluid() != null && --tickCheckHeating <= 0)
        {
            int heat = getHeatValueFromState(world.getBlockState(pos.down()));
            if (heat == 0 && !CuisineConfig.GENERAL.basinHeatingInDaylight)
            {
                failed = true;
                return;
            }
            tickCheckHeating = heat > 0 ? 200 / heat : 600;
            if (heat == 0 && !world.provider.isNether())
            {
                if (!world.provider.hasSkyLight() || !world.isDaytime() || world.isRaining() || !world.canSeeSky(pos))
                {
                    return;
                }
            }
            Boiling recipe = Processing.BOILING.findRecipe(stacks.getStackInSlot(0), tank.getFluid(), heat);
            if (recipe != null)
            {
                invLock = true;
                Output output = recipe.getOutputAndConsumeInput(stacks.getStackInSlot(0), tank.getFluid(), heat);
                if (output.fluid != null && output.fluid.amount <= 0)
                {
                    output.fluid = null;
                }
                tank.setFluid(output.fluid);
                StacksUtil.spawnItemStack(world, pos, output.item, true);
                invLock = false;
            }
            else
            {
                failed = true;
            }
        }
    }

    public boolean isWorking()
    {
        boolean flag = !failed && tank.getFluid() != null;
        if (flag)
        {
            int heat = getHeatValueFromState(world.getBlockState(pos.down()));
            if (heat == 0 && !world.provider.isNether())
            {
                if (!world.provider.hasSkyLight() || !world.isDaytime() || world.isRaining() || !world.canSeeSky(pos))
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public int getMaxHeatingTick()
    {
        int heat = getHeatValueFromState(world.getBlockState(pos.down()));
        return heat > 0 ? 200 / heat : 600;
    }

    public int getCurrentHeatingTick()
    {
        return tickCheckHeating;
    }

    @Override
    public void onContentsChanged(int slot)
    {
        if (!invLock)
        {
            super.onContentsChanged(slot);
            if (!world.isRemote && tank.getFluid() != null)
            {
                failed = false;
                tickCheckHeating = getMaxHeatingTick(); // on this stage, blockstates are not actual states
            }
        }
    }

    public static int getHeatValueFromState(IBlockState state)
    {
        Integer heat = STATE_HEAT_SOURCES.get(state);
        if (heat != null)
        {
            return heat;
        }
        heat = BLOCK_HEAT_SOURCES.get(state.getBlock());
        return heat != null ? heat : 0;
    }

    @Nonnull
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        invLock = true;
        super.readFromNBT(compound);
        invLock = false;
    }

    @Override
    public void onLoad()
    {
        super.onLoad();
        // Split from readFromNBT, since TileEntity.world may not be ready
        // when TileEntity data are read from disk, but it is ready at this
        // time moment.
        // After all, this method is here for catching up the very first
        // "tick" (actually a pseudo-tick) of TileEntity lifecycle.
        this.onContentsChanged(0);
    }
}
