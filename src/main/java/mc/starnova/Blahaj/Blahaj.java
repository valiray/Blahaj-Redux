package mc.starnova.Blahaj;

import mc.starnova.Blahaj.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mc.starnova.Blahaj.item.ModItemGroups;
import mc.starnova.Blahaj.item.ModItems;



public class Blahaj implements ModInitializer {
	public static final String MOD_ID = "blahaj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
//		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}