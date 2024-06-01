package mc.lunar.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import static mc.lunar.Blahaj.MOD_ID;


public class ModBlocks {

    public static final Identifier BLAHAJ_ID = new Identifier(MOD_ID, "blue_shark");
    public static final Identifier ACE_BLAHAJ = new Identifier(MOD_ID, "ace_shark");
    public static final Identifier AGENDER_BLAHAJ = new Identifier(MOD_ID, "agender_shark");
    public static final Identifier ARO_BLAHAJ = new Identifier(MOD_ID, "aro_shark");
    public static final Identifier AROACE_BLAHAJ = new Identifier(MOD_ID, "aroace_shark");
    public static final Identifier TRANS_BLAHAJ = new Identifier(MOD_ID, "trans_shark");
    public static final Identifier BI_BLAHAJ = new Identifier(MOD_ID, "bi_shark");
    public static final Identifier BAGUETTE = new Identifier(MOD_ID, "bread");
    public static final Identifier DEMIBOY_BLAHAJ = new Identifier(MOD_ID, "demiboy_shark");
    public static final Identifier DEMIGIRL_BLAHAJ = new Identifier(MOD_ID, "demigirl_shark");
    public static final Identifier ENBY_BLAHAJ = new Identifier(MOD_ID, "enby_shark");
    public static final Identifier RAINBOWDASH_BLAHAJ = new Identifier(MOD_ID, "gay_shark");
    public static final Identifier GENDERFLUID_BLAHAJ = new Identifier(MOD_ID, "genderfluid_shark");
    public static final Identifier GENDERQUEER_BLAHAJ = new Identifier(MOD_ID, "genderqueer_shark");
    public static final Identifier GRAY_BLAHAJ = new Identifier(MOD_ID, "gray_shark");
    public static final Identifier GRAYROSE_BLAHAJ = new Identifier(MOD_ID, "greyrose_shark");
    public static final Identifier INTERSEX_BLAHAJ = new Identifier(MOD_ID, "intersex_shark");
    public static final Identifier LESPONY_BLAHAJ = new Identifier(MOD_ID, "lesbian_shark");
    public static final Identifier PAN_BLAHAJ = new Identifier(MOD_ID, "pan_shark");
    public static final Identifier PINK_BLAHAJ = new Identifier(MOD_ID, "pink_shark");
    public static final Identifier POLY_BLAHAJ = new Identifier(MOD_ID, "poly_shark");
    public static final Identifier PRIDE_BLAHAJ = new Identifier(MOD_ID, "pride_shark");

    public static Block BLAHAJ_BLOCK;
    public static Item BLAHAJ_ITEM;
    public static Block AROACE_BLAHAJ_BLOCK;
    public static Item AROACE_BLAHAJ_ITEM;
    public static Block ACE_BLAHAJ_BLOCK;
    public static Item ACE_BLAHAJ_ITEM;
    public static Block AGENDER_BLAHAJ_BLOCK;
    public static Item AGENDER_BLAHAJ_ITEM;
    public static Block ARO_BLAHAJ_BLOCK;
    public static Item ARO_BLAHAJ_ITEM;
    public static Block TRANS_BLAHAJ_BLOCK;
    public static Item TRANS_BLAHAJ_ITEM;
    public static Block BI_BLAHAJ_BLOCK;
    public static Item BI_BLAHAJ_ITEM;
    public static Block BAGUETTE_BLOCK;
    public static Item BAGUETTE_ITEM;
    public static Block DEMIBOY_BLAHAJ_BLOCK;
    public static Item DEMIBOY_BLAHAJ_ITEM;
    public static Block DEMIGIRL_BLAHAJ_BLOCK;
    public static Item DEMIGIRL_BLAHAJ_ITEM;
    public static Block ENBY_BLAHAJ_BLOCK;
    public static Item ENBY_BLAHAJ_ITEM;
    public static Block RAINBOWDASH_BLAHAJ_BLOCK;
    public static Item RAINBOWDASH_BLAHAJ_ITEM;
    public static Block GENDERFLUID_BLAHAJ_BLOCK;
    public static Item GENDERFLUID_BLAHAJ_ITEM;
    public static Block GENDERQUEER_BLAHAJ_BLOCK;
    public static Item GENDERQUEER_BLAHAJ_ITEM;
    public static Block GRAY_BLAHAJ_BLOCK;
    public static Item GRAY_BLAHAJ_ITEM;
    public static Block GRAYROSE_BLAHAJ_BLOCK;
    public static Item GRAYROSE_BLAHAJ_ITEM;
    public static Block INTERSEX_BLAHAJ_BLOCK;
    public static Item INTERSEX_BLAHAJ_ITEM;
    public static Block LESPONY_BLAHAJ_BLOCK;
    public static Item LESPONY_BLAHAJ_ITEM;
    public static Block PAN_BLAHAJ_BLOCK;
    public static Item PAN_BLAHAJ_ITEM;
    public static Block PINK_BLAHAJ_BLOCK;
    public static Item PINK_BLAHAJ_ITEM;
    public static Block POLY_BLAHAJ_BLOCK;
    public static Item POLY_BLAHAJ_ITEM;
    public static Block PRIDE_BLAHAJ_BLOCK;
    public static Item PRIDE_BLAHAJ_ITEM;


    public static void register() {
            GRAY_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, GRAY_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, BLAHAJ_ID, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            BAGUETTE_BLOCK = Registry.register(Registries.BLOCK, BAGUETTE, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

            ACE_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, ACE_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            AGENDER_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, AGENDER_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            ARO_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, ARO_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            AROACE_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, AROACE_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            TRANS_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, TRANS_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            BI_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, BI_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            DEMIBOY_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, DEMIBOY_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            DEMIGIRL_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, DEMIGIRL_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            ENBY_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, ENBY_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            RAINBOWDASH_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, RAINBOWDASH_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            GENDERFLUID_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, GENDERFLUID_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            GENDERQUEER_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, GENDERQUEER_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            GRAYROSE_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, GRAYROSE_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            INTERSEX_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, INTERSEX_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            LESPONY_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, LESPONY_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            PAN_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, PAN_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            PINK_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, PINK_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            POLY_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, POLY_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
            PRIDE_BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, PRIDE_BLAHAJ, new CBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));



            GRAY_BLAHAJ_ITEM = Registry.register(Registries.ITEM, GRAY_BLAHAJ, new CItem(GRAY_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.gray_shark.tooltip"));
            BLAHAJ_ITEM = Registry.register(Registries.ITEM, BLAHAJ_ID, new CItem(BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.blue_shark.tooltip"));
            BAGUETTE_ITEM = Registry.register(Registries.ITEM, BAGUETTE, new CItem(BAGUETTE_BLOCK, new Item.Settings().maxCount(1), null));
            ACE_BLAHAJ_ITEM = Registry.register(Registries.ITEM, ACE_BLAHAJ, new CItem(ACE_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.ace_shark.tooltip"));
            AGENDER_BLAHAJ_ITEM = Registry.register(Registries.ITEM, AGENDER_BLAHAJ, new CItem(AGENDER_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.agender_shark.tooltip"));
            ARO_BLAHAJ_ITEM = Registry.register(Registries.ITEM, ARO_BLAHAJ, new CItem(ARO_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.aro_shark.tooltip"));
            AROACE_BLAHAJ_ITEM = Registry.register(Registries.ITEM, AROACE_BLAHAJ, new CItem(AROACE_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.aroace_shark.tooltip"));
            TRANS_BLAHAJ_ITEM = Registry.register(Registries.ITEM, TRANS_BLAHAJ, new CItem(TRANS_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.trans_shark.tooltip"));
            BI_BLAHAJ_ITEM = Registry.register(Registries.ITEM, BI_BLAHAJ, new CItem(BI_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.bi_shark.tooltip"));
            DEMIBOY_BLAHAJ_ITEM = Registry.register(Registries.ITEM, DEMIBOY_BLAHAJ, new CItem(DEMIBOY_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.demiboy_shark.tooltip"));
            DEMIGIRL_BLAHAJ_ITEM = Registry.register(Registries.ITEM, DEMIGIRL_BLAHAJ, new CItem(DEMIGIRL_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.demigirl_shark.tooltip"));
            ENBY_BLAHAJ_ITEM = Registry.register(Registries.ITEM, ENBY_BLAHAJ, new CItem(ENBY_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.enby_shark.tooltip"));
            RAINBOWDASH_BLAHAJ_ITEM = Registry.register(Registries.ITEM, RAINBOWDASH_BLAHAJ, new CItem(RAINBOWDASH_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.gay_shark.tooltip"));
            GENDERFLUID_BLAHAJ_ITEM = Registry.register(Registries.ITEM, GENDERFLUID_BLAHAJ, new CItem(GENDERFLUID_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.genderfluid_shark.tooltip"));
            GENDERQUEER_BLAHAJ_ITEM = Registry.register(Registries.ITEM, GENDERQUEER_BLAHAJ, new CItem(GENDERQUEER_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.genderqueer_shark.tooltip"));
            GRAYROSE_BLAHAJ_ITEM = Registry.register(Registries.ITEM, GRAYROSE_BLAHAJ, new CItem(GRAYROSE_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.greyrose_shark.tooltip"));
            INTERSEX_BLAHAJ_ITEM = Registry.register(Registries.ITEM, INTERSEX_BLAHAJ, new CItem(INTERSEX_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.intersex_shark.tooltip"));
            LESPONY_BLAHAJ_ITEM = Registry.register(Registries.ITEM, LESPONY_BLAHAJ, new CItem(LESPONY_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.lesbian_shark.tooltip"));
            PAN_BLAHAJ_ITEM = Registry.register(Registries.ITEM, PAN_BLAHAJ, new CItem(PAN_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.pan_shark.tooltip"));
            PINK_BLAHAJ_ITEM = Registry.register(Registries.ITEM, PINK_BLAHAJ, new CItem(PINK_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.pink_shark.tooltip"));
            POLY_BLAHAJ_ITEM = Registry.register(Registries.ITEM, POLY_BLAHAJ, new CItem(POLY_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.poly_shark.tooltip"));
            PRIDE_BLAHAJ_ITEM = Registry.register(Registries.ITEM, PRIDE_BLAHAJ, new CItem(PRIDE_BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.pride_shark.tooltip"));



    }

    public static void registerClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GRAY_BLAHAJ_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BLAHAJ_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BAGUETTE_BLOCK, RenderLayer.getCutout());
    }
}


