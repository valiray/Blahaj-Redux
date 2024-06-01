package mc.lunar.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;


public class CItem extends BlockItem {

    private final Text subtitle;

    public CItem(Block block, Settings settings, String subtitle) {
        super(block, settings);
        this.subtitle = subtitle == null ? null : Text.translatable(subtitle).formatted(Formatting.GRAY);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        if (this.subtitle != null) {
            tooltip.add(this.subtitle);
        }


}}
