package com.burningcactus.weaponmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;

public class CritEnchantment extends Enchantment {
    protected CritEnchantment(Rarity rarity, EquipmentSlotType[] slotTypes) {
        super(rarity, EnchantmentType.WEAPON, slotTypes);
    }

    /**
     * Returns the maximum level that the enchantment can have.
     */
    @Override
    public int getMaxLevel() {
        return 2;
    }

}
