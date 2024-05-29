package mc.lunar;

import mc.lunar.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mc.lunar.item.ModItemGroups;
import mc.lunar.item.ModItems;



public class Blahaj implements ModInitializer {
	public static final String MOD_ID = "blahaj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//ModItemGroups.registerItemGroups();
		ModBlocks.register();
		//ModItems.registerModItems();
	}
}