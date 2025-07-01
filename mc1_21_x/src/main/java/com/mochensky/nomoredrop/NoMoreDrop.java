package com.mochensky.nomoredrop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootTable;

public class NoMoreDrop implements ModInitializer {

    @Override
    public void onInitialize() {
        LootTableEvents.REPLACE.register((id, original, source) -> {
            if (id.getValue().getPath().startsWith("blocks/")) {
                return LootTable.builder().build();
            }
            return null;
        });
    }
}