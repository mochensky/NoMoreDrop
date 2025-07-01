package com.mochensky.nomoredrop;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.LootTable;

public class NoMoreDrop implements ModInitializer {

    @Override
    public void onInitialize() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (id.getPath().startsWith("blocks/")) {
                setter.set(LootTable.builder().build());
            }
        });
    }
}