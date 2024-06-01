package mc.lunar;

import mc.lunar.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;

public class BlahajClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        ModBlocks.registerClient();
    }
}