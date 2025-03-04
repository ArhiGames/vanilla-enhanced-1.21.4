package com.arhi.vanilla.enhanced.datagen;

import com.arhi.vanilla.enhanced.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        itemModelGenerator.register(ModItems.GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.TINTED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIME_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CYAN_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIGHT_BLUE_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUE_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAGENTA_STAINED_GLASS_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_STAINED_GLASS_SHARD, Models.GENERATED);
    }
}
