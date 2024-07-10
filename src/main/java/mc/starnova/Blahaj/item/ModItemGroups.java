package mc.starnova.Blahaj.item;

import mc.starnova.Blahaj.Blahaj;
import mc.starnova.Blahaj.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLAHAJ_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Blahaj.MOD_ID, "blahaj"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
                    .icon(() -> new ItemStack(ModBlocks.BLAHAJ_ID)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLAHAJ_ID);
                        entries.add(ModBlocks.ACE_BLAHAJ);
                        entries.add(ModBlocks.AGENDER_BLAHAJ);
                        entries.add(ModBlocks.ARO_BLAHAJ);
                        entries.add(ModBlocks.AROACE_BLAHAJ);
                        entries.add(ModBlocks.BI_BLAHAJ);
                        entries.add(ModBlocks.BAGUETTE);
                        entries.add(ModBlocks.DEMIBOY_BLAHAJ);
                        entries.add(ModBlocks.DEMIGIRL_BLAHAJ);
                        entries.add(ModBlocks.ENBY_BLAHAJ);
                        entries.add(ModBlocks.RAINBOWDASH_BLAHAJ);
                        entries.add(ModBlocks.GENDERFLUID_BLAHAJ);
                        entries.add(ModBlocks.GENDERQUEER_BLAHAJ);
                        entries.add(ModBlocks.GRAY_BLAHAJ);
                        entries.add(ModBlocks.GRAYROSE_BLAHAJ);
                        entries.add(ModBlocks.INTERSEX_BLAHAJ);
                        entries.add(ModBlocks.LESPONY_BLAHAJ);
                        entries.add(ModBlocks.PAN_BLAHAJ);
                        entries.add(ModBlocks.PINK_BLAHAJ);
                        entries.add(ModBlocks.POLY_BLAHAJ);
                        entries.add(ModBlocks.PRIDE_BLAHAJ);
                        entries.add(ModBlocks.TRANS_BLAHAJ);


                    }).build());


    public static void registerItemGroups() {
        Blahaj.LOGGER.info("Registering Item Groups for " + Blahaj.MOD_ID);
    }
}