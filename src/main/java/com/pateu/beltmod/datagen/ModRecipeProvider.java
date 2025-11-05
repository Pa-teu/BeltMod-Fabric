package com.pateu.beltmod.datagen;

import com.pateu.beltmod.block.ModBlocks;
import com.pateu.beltmod.item.BeltItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.Accessories_Block)
                .pattern("IPS")
                .pattern("WLW")
                .pattern("WWW")
                .input('W', Items.SPRUCE_PLANKS)
                .input('I', Items.IRON_INGOT)
                .input('P', Items.PAPER)
                .input('S', Items.INK_SAC)
                .input('L', Items.LEATHER)
                .criterion("has_planks", conditionsFromItem(Items.SPRUCE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, BeltItems.leather_belt)
                .pattern("LLL")
                .pattern("SIS")
                .pattern("LLL")
                .input('L', Items.LEATHER)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STRING)
                .criterion("has_leather", conditionsFromItem(Items.LEATHER))
                .offerTo(exporter);


    }
}
