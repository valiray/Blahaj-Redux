package mc.starnova.Blahaj.block;

import mc.starnova.Blahaj.Blahaj;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModBlocks {

    public static final Item BLAHAJ_ID = Item.fromBlock(registerBlock("blue_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never))));
    public static final Item ACE_BLAHAJ = Item.fromBlock(registerBlock("ace_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL).nonOpaque())));
    public static final Item AGENDER_BLAHAJ = Item.fromBlock(registerBlock("agender_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL).nonOpaque())));
    public static final Item ARO_BLAHAJ = Item.fromBlock(registerBlock("aro_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL).nonOpaque())));
    public static final Item AROACE_BLAHAJ = Item.fromBlock(registerBlock("aroace_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL).nonOpaque())));
    public static final Item BI_BLAHAJ = Item.fromBlock(registerBlock("bi_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item BAGUETTE = Item.fromBlock(registerBlock("bread",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item DEMIBOY_BLAHAJ = Item.fromBlock(registerBlock("demiboy_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item DEMIGIRL_BLAHAJ = Item.fromBlock(registerBlock("demigirl_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item ENBY_BLAHAJ = Item.fromBlock(registerBlock("enby_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item RAINBOWDASH_BLAHAJ = Item.fromBlock(registerBlock("gay_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item GENDERFLUID_BLAHAJ = Item.fromBlock(registerBlock("genderfluid_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item GENDERQUEER_BLAHAJ = Item.fromBlock(registerBlock("genderqueer_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item GRAY_BLAHAJ = Item.fromBlock(registerBlock("gray_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item GRAYROSE_BLAHAJ = Item.fromBlock(registerBlock("greyrose_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item INTERSEX_BLAHAJ = Item.fromBlock(registerBlock("intersex_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item LESPONY_BLAHAJ = Item.fromBlock(registerBlock("lesbian_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item PAN_BLAHAJ = Item.fromBlock(registerBlock("pan_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item PINK_BLAHAJ = Item.fromBlock(registerBlock("pink_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item POLY_BLAHAJ = Item.fromBlock(registerBlock("poly_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item PRIDE_BLAHAJ = Item.fromBlock(registerBlock("pride_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));
    public static final Item TRANS_BLAHAJ = Item.fromBlock(registerBlock("trans_shark",
            new Block(FabricBlockSettings.copyOf(Blocks.SKELETON_SKULL))));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Blahaj.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Blahaj.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }



    public static void registerModBlocks() {
        Blahaj.LOGGER.info("Registering ModBlocks for " + Blahaj.MOD_ID);
    }
}


