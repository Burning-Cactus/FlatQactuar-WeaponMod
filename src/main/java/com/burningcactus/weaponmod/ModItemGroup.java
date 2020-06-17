package com.burningcactus.weaponmod;

import com.burningcactus.weaponmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class ModItemGroup extends ItemGroup {
    public static final ModItemGroup WEAPON_GROUP = new ModItemGroup("cactusweapons", () -> ModItems.IRON_BATTLEAXE);

    private Supplier<Item> item;

    public ModItemGroup(String p_i230076_1_, Supplier<Item> itemProvider) {
        super(p_i230076_1_);
        item = itemProvider;
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(item.get());
    }
}
