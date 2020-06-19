package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.util.ModAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class SpearItem extends SwordItem {
    private final float extendedReach;
    public SpearItem(IItemTier tier, int power, float speed, float reach, Properties builder) {
        super(tier, power, speed, builder);
        extendedReach = reach;
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot) {
        Multimap attributes = super.getAttributeModifiers(slot);
        if(slot == EquipmentSlotType.MAINHAND) {
            attributes.put(ModAttributes.MELEE_REACH.getName(), new AttributeModifier(ModAttributes.MELEE_REACH_UUID, "Weapon modifier", this.extendedReach, AttributeModifier.Operation.ADDITION));
        }
        return attributes;
    }
}
