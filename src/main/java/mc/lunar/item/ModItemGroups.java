package mc.lunar.item;

import mc.lunar.Blahaj;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Blahaj.MOD, "blahaj"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blahaj"))
                    .icon(() -> new ItemStack(ModItems.BLAHAJ)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BLAHAJ);
                        entries.add(ModItems.ACE_BLAHAJ);
                        entries.add(ModItems.AGENDER_BLAHAJ);
                        entries.add(ModItems.ARO_BLAHAJ);
                        entries.add(ModItems.AROACE_BLAHAJ);
                        entries.add(ModItems.TRANS_BLAHAJ);
                        entries.add(ModItems.BI_BLAHAJ);
                        entries.add(ModItems.BLUE_WHALE);
                        entries.add(ModItems.BAGUETTE);
                        entries.add(ModItems.DEMIBOY_BLAHAJ);
                        entries.add(ModItems.DEMIGIRL_BLAHAJ);
                        entries.add(ModItems.ENBY_BLAHAJ);
                        entries.add(ModItems.RAINBOWDASH_BLAHAJ);
                        entries.add(ModItems.GENDERFLUID_BLAHAJ);
                        entries.add(ModItems.GENDERQUEER_BLAHAJ);
                        entries.add(ModItems.GRAY_BLAHAJ);
                        entries.add(ModItems.GRAYROSE_BLAHAJ);
                        entries.add(ModItems.INTERSEX_BLAHAJ);
                        entries.add(ModItems.KILLER_WHALE);
                        entries.add(ModItems.LESPONY_BLAHAJ);
                        entries.add(ModItems.PAN_BLAHAJ);
                        entries.add(ModItems.PINK_BLAHAJ);
                        entries.add(ModItems.POLY_BLAHAJ);
                        entries.add(ModItems.PRIDE_BLAHAJ);
                        entries.add(ModItems.SEAL);


                    }).build());


    public static void registerItemGroups() {
        Blahaj.LOGGER.info("Registering Item Groups for " + Blahaj.MOD);
    }
}