package com.pateu.beltmod.item;

import com.pateu.beltmod.BeltMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BeltItems {

  public static final Item leather_belt = registerItem("leather_belt",new Item(new Item.Settings().maxCount(1)));

  public static final Item iron_belt = registerItem("iron_belt",new Item(new Item.Settings().maxCount(1)));

  public static final Item gold_belt = registerItem("gold_belt",new Item(new Item.Settings().maxCount(1)));

  public static final Item diamond_belt = registerItem("diamond_belt",new Item(new Item.Settings().maxCount(1)));

  public static final Item netherite_belt = registerItem("netherite_belt",new Item(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BeltMod.MOD_ID, name), item);
    }

    public static void registerItems() {

        BeltMod.LOGGER.info("Registering Items for " + BeltMod.MOD_ID);

    }
}
