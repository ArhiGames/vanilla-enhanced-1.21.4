package com.arhi.vanilla.enhanced.item;

import com.arhi.vanilla.enhanced.VanillaEnhanced;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems
{
    public static final RegistryKey<ItemGroup> QUALITY_OF_LIFE_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(),
            Identifier.of(VanillaEnhanced.MOD_ID, "quality_of_life"));
    public static final ItemGroup QUALITY_OF_LIFE_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.GLASS_SHARD))
            .displayName(Text.translatable("itemgroup.quality_of_life"))
            .build();

    public static final Item GLASS_SHARD = registerItem("glass_shard", Item::new, new Item.Settings());
    public static final Item TINTED_GLASS_SHARD = registerItem("tinted_glass_shard", Item::new, new Item.Settings());
    public static final Item WHITE_STAINED_GLASS_SHARD = registerItem("white_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item GRAY_STAINED_GLASS_SHARD = registerItem("gray_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item BLACK_STAINED_GLASS_SHARD = registerItem("black_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item BROWN_STAINED_GLASS_SHARD = registerItem("brown_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item RED_STAINED_GLASS_SHARD = registerItem("red_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item ORANGE_STAINED_GLASS_SHARD = registerItem("orange_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item YELLOW_STAINED_GLASS_SHARD = registerItem("yellow_stained_glass_shard", Item::new, new Item.Settings());
    public static final Item LIME_STAINED_GLASS_SHARD = registerItem("lime_stained_glass_shard", Item::new, new Item.Settings());

    private static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings)
    {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaEnhanced.MOD_ID, name));

        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    public static void registerModItems()
    {
        VanillaEnhanced.LOGGER.info("Registering Mod Items for " + VanillaEnhanced.MOD_ID);

        Registry.register(Registries.ITEM_GROUP, QUALITY_OF_LIFE_GROUP_KEY, QUALITY_OF_LIFE_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(QUALITY_OF_LIFE_GROUP_KEY).register(fabricItemGroupEntries ->
        {
            fabricItemGroupEntries.add(GLASS_SHARD);
            fabricItemGroupEntries.add(WHITE_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(GRAY_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(BLACK_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(BROWN_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(RED_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(ORANGE_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(YELLOW_STAINED_GLASS_SHARD);
            fabricItemGroupEntries.add(LIME_STAINED_GLASS_SHARD);
        });
    }
}