package com.burningcactus.weaponmod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {
    public static final ModItemGroup WEAPON_GROUP = new ModItemGroup("cactusweapons", () -> ModItems.IRON_BATTLEAXE);

    private Supplier<Item> item;

    public ModItemGroup(String name, Supplier<Item> itemProvider) {
        super(name);
        item = itemProvider;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item.get());
    }
}
