package mc.lunar;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import mc.lunar.item.ModItemGroups;
import mc.lunar.item.ModItems;



public class Blahaj implements ModInitializer {
	public static final String MOD = "blahaj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}