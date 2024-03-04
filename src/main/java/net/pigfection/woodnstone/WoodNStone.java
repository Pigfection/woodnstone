package net.pigfection.woodnstone;

import net.fabricmc.api.ModInitializer;

import net.pigfection.woodnstone.item.ModItemGroups;
import net.pigfection.woodnstone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodNStone implements ModInitializer {
	public static final String MOD_ID = "woodnstone";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}