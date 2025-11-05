package com.pateu.beltmod.datagen;

import com.pateu.beltmod.block.ModBlocks;
import com.pateu.beltmod.item.BeltItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.Accessories_Block);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
     itemModelGenerator.register(BeltItems.leather_belt, Models.GENERATED);
        itemModelGenerator.register(BeltItems.iron_belt, Models.GENERATED);
        itemModelGenerator.register(BeltItems.gold_belt, Models.GENERATED);
        itemModelGenerator.register(BeltItems.diamond_belt, Models.GENERATED);
        itemModelGenerator.register(BeltItems.netherite_belt, Models.GENERATED);
    }
}
