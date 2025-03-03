package com.arhi.vanilla.enhanced;

import com.arhi.vanilla.enhanced.item.ModItems;
import com.arhi.vanilla.enhanced.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.server.world.BlockEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaEnhanced implements ModInitializer
{
	public static final String MOD_ID = "vanilla-enhanced";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModLootTableModifiers.modifyLootTables();

		ModItems.registerModItems();
	}
}