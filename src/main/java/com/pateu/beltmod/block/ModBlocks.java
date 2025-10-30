package com.pateu.beltmod.block;

import com.pateu.beltmod.BeltMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;


public class ModBlocks {

   public static final Block Accessories_Block = registerBlock("accessories_block",
           new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD)));


   private static Block registerBlock(String name, Block block) {
       registerBlockItem(name, block);
       return Registry.register(Registries.BLOCK,Identifier.of(BeltMod.MOD_ID,name),block);
   }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BeltMod.MOD_ID,name),
        new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlocks()

    {
        BeltMod.LOGGER.info("Registering ModBlocks for " + BeltMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        entries.add(ModBlocks.Accessories_Block);
     });
   }
    }
