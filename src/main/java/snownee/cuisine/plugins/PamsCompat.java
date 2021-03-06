package snownee.cuisine.plugins;

import snownee.cuisine.Cuisine;
import snownee.cuisine.api.CulinaryHub;
import snownee.cuisine.api.Form;
import snownee.cuisine.api.Ingredient;
import snownee.cuisine.api.Material;
import snownee.cuisine.api.MaterialCategory;
import snownee.cuisine.api.prefab.SimpleMaterialImpl;
import snownee.kiwi.IModule;
import snownee.kiwi.KiwiModule;

@KiwiModule(modid = Cuisine.MODID, name = "harvestcraft", dependency = "harvestcraft", optional = true)
public class PamsCompat implements IModule
{
    @Override
    public void init()
    {
        Material blackberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("blackberry", 0x1D1019, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropBlackberry", blackberry);
        Material blueberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("blueberry", 0x204569, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropBlueberry", blueberry);
        Material grape = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("grape", 0x582945, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropGrape", grape);
        Material cranberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("cranberry", 0x5f1818, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropCranberry", cranberry);
        Material pineapple = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("pineapple", 0xa9861c, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPineapple", pineapple);
        Material cactus_fruit = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("cactus_fruit", 0xdb3333, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropCactusfruit", cactus_fruit);
        Material cantaloupe = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("cantaloupe", 0xb7ad58, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropCantaloupe", cantaloupe);
        Material kiwi = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("kiwi", 0xa3a153, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropKiwi", kiwi);
        Material raspberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("raspberry", 0x6e3b2a, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropRaspberry", raspberry);
        Material strawberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("strawberry", 0x750d04, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropStrawberry", strawberry);
        Material banana = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("banana", 0x714e09, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropBanana", banana);
        Material cherry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("cherry", 0x721104, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropCherry", cherry);
        Material dragonfruit = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("dragonfruit", 0xb82e19, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropDragonfruit", dragonfruit);
        Material mango = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("mango", 0x54430f, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropMango", mango);
        Material papaya = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("papaya", 0xe4b373, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPapaya", papaya);
        Material peach = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("peach", 0xeb9960, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPeach", peach);
        Material pear = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("pear", 0xb6c65b, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPear", pear);
        Material plum = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("plum", 0xba5bc1, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPlum", plum);
        Material pomegranate = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("pomegranate", 0xd48585, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPomegranate", pomegranate);
        Material starfruit = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("starfruit", 0xd2ee9d, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropStarfruit", starfruit);
        Material gooseberry = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("gooseberry", 0xb98c0b, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropGooseberry", gooseberry);
        Material apricot = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("apricot", 0xebb981, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropApricot", apricot);
        Material date = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("date", 0x3b5323, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropDate", date);
        Material fig = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("fig", 0x8446ab, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropFig", fig);
        Material persimmon = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("persimmon", 0xc26413, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY));
        CulinaryHub.API_INSTANCE.registerMapping("cropPersimmon", persimmon);
        Helper.registerMaterial(new SimpleMaterialImpl("pawpaw", 0x91bb69, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:pawpawitem");
        Helper.registerMaterial(new SimpleMaterialImpl("soursop", 0x8bc34b, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:soursopitem");
        Helper.registerMaterial(new SimpleMaterialImpl("guava", 0x558d30, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:guavaitem");
        Helper.registerMaterial(new SimpleMaterialImpl("lychee", 0xab2323, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:lycheeitem");
        Helper.registerMaterial(new SimpleMaterialImpl("passion_fruit", 0x5b3a43, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:passionfruititem");
        Helper.registerMaterial(new SimpleMaterialImpl("rambutan", 0xa31b1b, 0, 0, 0, 0, 0, MaterialCategory.FRUIT).setValidForms(Form.JUICE_ONLY), "harvestcraft:rambutanitem");

        Material asparagus = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("asparagus", 0x416f33, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropAsparagus", asparagus);
        Material beans = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("beans", 0x44361d, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropBeans", beans);
        Material broccoli = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("broccoli", 0x71a141, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropBroccoli", broccoli);
        Material cauliflower = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("cauliflower", 0xcddaa5, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropCauliflower", cauliflower);
        Material celery = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("celery", 0x81c55b, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropCelery", celery);
        Material parsnip = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("parsnip", 0xcacdb0, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropParsnip", parsnip);
        Material radish = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("radish", 0x6b2323, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropRadish", radish);
        Material rutabaga = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("rutabaga", 0x5d714f, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropRutabaga", rutabaga);
        Material sweet_potato = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("sweet_potato", 0x783711, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropSweetpotato", sweet_potato);
        Material artichoke = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("artichoke", 0x6e8b52, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropArtichoke", artichoke);
        Material brussel_sprout = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("brussel_sprout", 0x6eab21, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropBrusselsprout", brussel_sprout);
        Material okra = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("okra", 0x176306, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropOkra", okra);
        Material peas = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("peas", 0x5e8c2d, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropPeas", peas);
        Material rhubarb = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("rhubarb", 0xd99c9c, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropRhubarb", rhubarb);
        Material seaweed = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("seaweed", 0x305e38, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropSeaweed", seaweed);
        Material winter_squash = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("winter_squash", 0xaba35b, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropWintersquash", winter_squash);
        Material zucchini = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("zucchini", 0x59892c, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropZucchini", zucchini);
        Material water_chestnut = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl("water_chestnut", 0x614430, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));
        CulinaryHub.API_INSTANCE.registerMapping("cropWaterchestnut", water_chestnut);
        Helper.registerMaterial(new SimpleMaterialImpl("tamarind", 0x997336, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE), "harvestcraft:tamarinditem");
        Helper.registerMaterial(new SimpleMaterialImpl("jackfruit", 0x614430, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE), "harvestcraft:jackfruititem");

        CulinaryHub.API_INSTANCE.registerMapping("cropBeet", CulinaryHub.CommonMaterials.BEETROOT);
        CulinaryHub.API_INSTANCE.registerMapping("cropWhitemushroom", CulinaryHub.CommonMaterials.MUSHROOM);
        CulinaryHub.API_INSTANCE.registerMapping("foodApplejuice", new Ingredient(CulinaryHub.CommonMaterials.APPLE, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodMelonjuice", new Ingredient(CulinaryHub.CommonMaterials.MELON, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodCarrotjuice", new Ingredient(CulinaryHub.CommonMaterials.CARROT, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodStrawberryjuice", new Ingredient(strawberry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodGrapejuice", new Ingredient(grape, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodBlueberryjuice", new Ingredient(blueberry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodCherryjuice", new Ingredient(cherry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPapayajuice", new Ingredient(papaya, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodStarfruitjuice", new Ingredient(starfruit, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodOrangejuice", new Ingredient(CulinaryHub.CommonMaterials.ORANGE, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPeachjuice", new Ingredient(peach, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodLimejuice", new Ingredient(CulinaryHub.CommonMaterials.LIME, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodMangojuice", new Ingredient(mango, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPomegranatejuice", new Ingredient(pomegranate, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodBlackberryjuice", new Ingredient(blackberry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodRaspberryjuice", new Ingredient(raspberry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodKiwijuice", new Ingredient(kiwi, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodCranberryjuice", new Ingredient(cranberry, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodCactusfruitjuice", new Ingredient(cactus_fruit, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPlumjuice", new Ingredient(plum, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPearjuice", new Ingredient(pear, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodApricotjuice", new Ingredient(apricot, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodFigjuice", new Ingredient(fig, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodGrapefruitjuice", new Ingredient(CulinaryHub.CommonMaterials.GRAPEFRUIT, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodPersimmonjuice", new Ingredient(persimmon, Form.JUICE, 1));
        CulinaryHub.API_INSTANCE.registerMapping("foodLemonaide", new Ingredient(CulinaryHub.CommonMaterials.LEMON, Form.JUICE, 1));
    }

    //    @Override
    //    @SideOnly(Side.CLIENT)
    //    public void postInit()
    //    {
    //        for (ItemStack stack : OreDictionary.getOres("listAllfruit", false))
    //        {
    //            if (stack.getItem().getCreatorModId(stack).equals("harvestcraft"))
    //            {
    //                String name = stack.getDisplayName().toLowerCase().replace(' ', '_');
    //                String string = String.format("cuisine.material.%s=%s", name, stack.getDisplayName());
    //                System.out.println(string);
    //            }
    //        }
    //        for (ItemStack stack : OreDictionary.getOres("listAllveggie", false))
    //        {
    //            if (stack.getItem().getCreatorModId(stack).equals("harvestcraft"))
    //            {
    //                String name = stack.getDisplayName().toLowerCase().replace(' ', '_');
    //                String string = String.format("cuisine.material.%s=%s", name, stack.getDisplayName());
    //                System.out.println(string);
    //            }
    //        }
    //        for (ItemStack stack : OreDictionary.getOres("listAllveggie", false))
    //        {
    //            if (stack.getItem().getCreatorModId(stack).equals("harvestcraft"))
    //            {
    //                String name = stack.getDisplayName().toLowerCase().replace(' ', '_');
    //                int color = ColorGetter.getColors(stack, 1).get(0).getRGB() & 0x00FFFFFF;
    //                String string = String.format("Material %s = CulinaryHub.API_INSTANCE.register(new SimpleMaterialImpl(\"%s\", 0x%06x, 0, 0, 0, 0, 0, MaterialCategory.VEGETABLES).setValidForms(Form.ALL_FORMS_INCLUDING_JUICE));", name, name, color);
    //                System.out.println(string);
    //                string = String.format("CulinaryHub.API_INSTANCE.registerMapping(\"%s\", %s);", "crop" + name.substring(0, 1).toUpperCase() + name.substring(1).replace("_", ""), name);
    //                System.out.println(string);
    //            }
    //        }
    //    }
}
