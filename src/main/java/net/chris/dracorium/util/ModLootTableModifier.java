package net.chris.dracorium.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.chris.dracorium.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifier {
    private static final Identifier EndCityId =
            new Identifier("minecraft", "chests/end_city_treasure");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(EndCityId.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.8f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.DracoriumIngot))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 7.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

        });
    }
}
