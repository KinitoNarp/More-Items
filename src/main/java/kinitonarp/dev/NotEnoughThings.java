package kinitonarp.dev;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kinitonarp.dev.item.Macaron;

public class NotEnoughThings implements ModInitializer {
	public static final String MOD_ID = "not-enough-things";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Macaron.registerModItems();
		LOGGER.info("> MOD LOADED!");
		// Add the macaron to the Food & Drinks creative tab
    ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
        entries.add(Macaron.MACARON);
	});
}}