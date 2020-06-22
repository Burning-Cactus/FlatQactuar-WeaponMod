package com.burningcactus.weaponmod.enchantment;

import com.burningcactus.weaponmod.potion.ModEffects;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;

/**
 * This enchantment applies the bleed effect to any living entity that it hits.
 */
public class BleedEnchantment extends Enchantment {
    protected BleedEnchantment(Rarity rarity, EquipmentSlotType[] slotTypes) {
        super(rarity, EnchantmentType.WEAPON, slotTypes);
    }

    /**
     * Called whenever a mob is damaged with an item that has this enchantment on it.
     */
    @Override
    public void onEntityDamaged(LivingEntity user, Entity target, int level) {
        if(target instanceof LivingEntity) {
            ((LivingEntity) target).addPotionEffect(new EffectInstance(ModEffects.BLEED, level * 80));
        }
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }

}
