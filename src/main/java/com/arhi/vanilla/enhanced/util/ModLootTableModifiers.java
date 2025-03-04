package com.arhi.vanilla.enhanced.util;

import com.arhi.vanilla.enhanced.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers
{
    private static final Identifier GLASS_BLOCK_ID = Identifier.of("minecraft", "blocks/glass");
    private static final Identifier WHITE_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/white_stained_glass");
    private static final Identifier GRAY_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/gray_stained_glass");
    private static final Identifier BLACK_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/black_stained_glass");
    private static final Identifier BROWN_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/brown_stained_glass");
    private static final Identifier RED_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/red_stained_glass");
    private static final Identifier ORANGE_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/orange_stained_glass");
    private static final Identifier YELLOW_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/yellow_stained_glass");
    private static final Identifier LIME_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/lime_stained_glass");
    private static final Identifier GREEN_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/green_stained_glass");
    private static final Identifier CYAN_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/cyan_stained_glass");
    private static final Identifier LIGHT_BLUE_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/light_blue_stained_glass");
    private static final Identifier BLUE_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/blue_stained_glass");
    private static final Identifier PURPLE_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/purple_stained_glass");
    private static final Identifier MAGENTA_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/magenta_stained_glass");
    private static final Identifier PINK_STAINED_BLOCK_ID = Identifier.of("minecraft", "blocks/pink_stained_glass");

    public static void modifyLootTables()
    {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) ->
        {
            if (GLASS_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.GLASS_SHARD), 0.f, 4.f).build());
            }
            if (WHITE_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.WHITE_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (GRAY_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.GRAY_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (BLACK_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.BLACK_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (BROWN_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.BROWN_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (RED_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.RED_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (ORANGE_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.ORANGE_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (YELLOW_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.YELLOW_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (LIME_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.LIME_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (GREEN_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.GREEN_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (CYAN_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.CYAN_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (LIGHT_BLUE_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.LIGHT_BLUE_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (BLUE_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.BLUE_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (PURPLE_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.PURPLE_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (MAGENTA_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.MAGENTA_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
            if (PINK_STAINED_BLOCK_ID.equals(key.getValue()))
            {
                tableBuilder.pool(createLootPoolBuilder(1, 1.f, ItemEntry.builder(ModItems.PINK_STAINED_GLASS_SHARD), 0.f, 4.f).build());
            }
        });
    }

    public static LootPool.Builder createLootPoolBuilder(int rolls, float chance, LootPoolEntry.Builder<?> itemDrop, float min, float max)
    {
        return LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(rolls))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(itemDrop)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)).build());
    }
}
