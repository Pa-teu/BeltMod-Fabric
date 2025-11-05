package com.pateu.beltmod.datagen;

import com.pateu.beltmod.item.BeltItems;
import com.pateu.beltmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.BELTS)
                .add(BeltItems.leather_belt)
                .add(BeltItems.iron_belt)
                .add(BeltItems.gold_belt)
                .add(BeltItems.diamond_belt)
                .add(BeltItems.netherite_belt);
    }
}
