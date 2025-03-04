package com.arhi.vanilla.enhanced.datagen;

import com.arhi.vanilla.enhanced.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter)
    {
        return new RecipeGenerator(wrapperLookup, recipeExporter)
        {
            @Override
            public void generate()
            {
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GLASS, ModItems.GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.TINTED_GLASS, ModItems.TINTED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.WHITE_STAINED_GLASS, ModItems.WHITE_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GRAY_STAINED_GLASS, ModItems.GRAY_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLACK_STAINED_GLASS, ModItems.BLACK_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BROWN_STAINED_GLASS, ModItems.BROWN_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.RED_STAINED_GLASS, ModItems.RED_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.ORANGE_STAINED_GLASS, ModItems.ORANGE_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.YELLOW_STAINED_GLASS, ModItems.YELLOW_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIME_STAINED_GLASS, ModItems.LIME_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.GREEN_STAINED_GLASS, ModItems.GREEN_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.CYAN_STAINED_GLASS, ModItems.CYAN_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.LIGHT_BLUE_STAINED_GLASS, ModItems.LIGHT_BLUE_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.BLUE_STAINED_GLASS, ModItems.BLUE_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PURPLE_STAINED_GLASS, ModItems.PURPLE_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.MAGENTA_STAINED_GLASS, ModItems.MAGENTA_STAINED_GLASS_SHARD);
                offer2x2CompactingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.PINK_STAINED_GLASS, ModItems.PINK_STAINED_GLASS_SHARD);
            }
        };
    }

    @Override
    public String getName()
    {
        return "VanillaEnhancedRecipeProvider";
    }
}
