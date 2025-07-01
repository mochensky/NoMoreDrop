package com.mochensky.nomoredrop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableSource;
import net.minecraft.loot.LootManager;
import net.minecraft.loot.LootTable;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

public class NoMoreDrop implements ModInitializer {

    @Override
    public void onInitialize() {
        LootTableEvents.REPLACE.register((ResourceManager resourceManager, LootManager lootManager, Identifier id, LootTable original, LootTableSource source) -> {
            if (id.getPath().startsWith("blocks/")) {
                return LootTable.builder().build();
            }
            return null;
        });
    }
}