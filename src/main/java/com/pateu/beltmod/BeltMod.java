package com.pateu.beltmod;

import com.pateu.beltmod.item.BeltItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeltMod implements ModInitializer {
	public static final String MOD_ID = "beltmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        BeltItems.registerItems();
    }
}