package com.pateu.beltmod.util;

import com.pateu.beltmod.BeltMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> createtag(String name) {

            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BeltMod.MOD_ID, name));
        }

        public static class Items {
            public static final TagKey<Item> BELTS = createtag("belts");


            private static TagKey<Item> createtag(String name) {

                return TagKey.of(RegistryKeys.ITEM, Identifier.of(BeltMod.MOD_ID, name));
            }

        }

    }
}
