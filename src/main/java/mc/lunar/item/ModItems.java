package mc.lunar.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import mc.lunar.Blahaj;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLAHAJ_ID = registerItem("blue_shark", new Item(new FabricItemSettings()));
    public static final Item ACE_BLAHAJ = registerItem("ace_shark", new Item(new FabricItemSettings()));
    public static final Item AGENDER_BLAHAJ = registerItem("agender_shark", new Item(new FabricItemSettings()));
    public static final Item ARO_BLAHAJ = registerItem("aro_shark", new Item(new FabricItemSettings()));
    public static final Item AROACE_BLAHAJ = registerItem("aroace_shark", new Item(new FabricItemSettings()));
    public static final Item TRANS_BLAHAJ = registerItem("trans_shark", new Item(new FabricItemSettings()));
    public static final Item BI_BLAHAJ = registerItem("bi_shark", new Item(new FabricItemSettings()));
    public static final Item BAGUETTE = registerItem("bread", new Item(new FabricItemSettings()));
    public static final Item DEMIBOY_BLAHAJ = registerItem("demiboy_shark", new Item(new FabricItemSettings()));
    public static final Item DEMIGIRL_BLAHAJ = registerItem("demigirl_shark", new Item(new FabricItemSettings()));
    public static final Item ENBY_BLAHAJ = registerItem("enby_shark", new Item(new FabricItemSettings()));
    public static final Item RAINBOWDASH_BLAHAJ = registerItem("gay_shark", new Item(new FabricItemSettings()));
    public static final Item GENDERFLUID_BLAHAJ = registerItem("genderfluid_shark", new Item(new FabricItemSettings()));
    public static final Item GENDERQUEER_BLAHAJ = registerItem("genderqueer_shark", new Item(new FabricItemSettings()));
    public static final Item GRAY_BLAHAJ = registerItem("gray_shark", new Item(new FabricItemSettings()));
    public static final Item GRAYROSE_BLAHAJ = registerItem("greyrose_shark", new Item(new FabricItemSettings()));
    public static final Item INTERSEX_BLAHAJ = registerItem("intersex_shark", new Item(new FabricItemSettings()));
    public static final Item LESPONY_BLAHAJ = registerItem("lesbian_shark", new Item(new FabricItemSettings()));
    public static final Item PAN_BLAHAJ = registerItem("pan_shark", new Item(new FabricItemSettings()));
    public static final Item PINK_BLAHAJ = registerItem("pink_shark", new Item(new FabricItemSettings()));
    public static final Item POLY_BLAHAJ = registerItem("poly_shark", new Item(new FabricItemSettings()));
    public static final Item PRIDE_BLAHAJ = registerItem("pride_shark", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(BLAHAJ_ID);
        entries.add(ACE_BLAHAJ);
        entries.add(AGENDER_BLAHAJ);
        entries.add(ARO_BLAHAJ);
        entries.add(AROACE_BLAHAJ);
        entries.add(TRANS_BLAHAJ);
        entries.add(BI_BLAHAJ);
        entries.add(BAGUETTE);
        entries.add(DEMIBOY_BLAHAJ);
        entries.add(DEMIGIRL_BLAHAJ);
        entries.add(ENBY_BLAHAJ);
        entries.add(RAINBOWDASH_BLAHAJ);
        entries.add(GENDERFLUID_BLAHAJ);
        entries.add(GENDERQUEER_BLAHAJ);
        entries.add(GRAY_BLAHAJ);
        entries.add(GRAYROSE_BLAHAJ);
        entries.add(INTERSEX_BLAHAJ);
        entries.add(LESPONY_BLAHAJ);
        entries.add(PAN_BLAHAJ);
        entries.add(PINK_BLAHAJ);
        entries.add(POLY_BLAHAJ);
        entries.add(PRIDE_BLAHAJ);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Blahaj.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Blahaj.LOGGER.info("Registering Mod Items for " + Blahaj.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
