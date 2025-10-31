package com.pateu.beltmod.item;
import com.pateu.beltmod.BeltMod;

import com.pateu.beltmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ModItemGroups {

    public static final ItemGroup BELT_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(BeltMod.MOD_ID, "belt_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.Accessories_Block))
                    .displayName(Text.translatable("Belt and Accessories"))
                    .entries((displayContext, entries) -> {
                        entries.add(BeltItems.leather_belt);
                        entries.add(BeltItems.iron_belt);
                        entries.add(BeltItems.gold_belt);
                        entries.add(BeltItems.diamond_belt);
                        entries.add(BeltItems.netherite_belt);
                        entries.add(ModBlocks.Accessories_Block);
                    })
                    .build());

    public static void registerItemGroups() {
        BeltMod.LOGGER.info("Registering ItemGroups for " + BeltMod.MOD_ID);
    }
}
