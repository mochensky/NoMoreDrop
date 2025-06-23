// 1.20.5+
package com.mochensky.nomoredrop;

import net.fabricmc.api.ModInitializer;
import net.minecraft.loot.LootTable;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

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

// 1.20-1.20.4
//package com.mochensky.nomoredrop;
//
//import net.fabricmc.api.ModInitializer;
//import net.minecraft.loot.LootTable;
//import net.minecraft.util.Identifier;
//import net.minecraft.resource.ResourceManager;
//import net.minecraft.loot.LootManager;
//import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
//import net.fabricmc.fabric.api.loot.v2.LootTableSource;
//
//public class NoMoreDrop implements ModInitializer {
//
//    @Override
//    public void onInitialize() {
//        LootTableEvents.REPLACE.register((ResourceManager resourceManager, LootManager lootManager, Identifier id, LootTable original, LootTableSource source) -> {
//            if (id.getPath().startsWith("blocks/")) {
//                return LootTable.builder().build();
//            }
//            return null;
//        });
//    }
//}
