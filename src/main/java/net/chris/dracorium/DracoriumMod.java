package net.chris.dracorium;

import net.chris.dracorium.block.ModBlocks;
import net.chris.dracorium.item.ModItemGroups;
import net.chris.dracorium.item.ModItems;
import net.chris.dracorium.util.ModLootTableModifier;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DracoriumMod implements ModInitializer {
	public static  final String MOD_ID = "dracorium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registeredModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifier.modifyLootTables();
	}
}
