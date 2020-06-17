package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.util.ModAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class BattleaxeItem extends SwordItem {
    private final float critChance;
    public BattleaxeItem(IItemTier tier, int strength, float speed, float critChance, Properties builder) {
        super(tier, strength, speed, builder);
        this.critChance = critChance;
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot) {
        Multimap<String, AttributeModifier> attributes = super.getAttributeModifiers(slot);
        if(slot == EquipmentSlotType.MAINHAND) {
            attributes.put(ModAttributes.CRITICAL_CHANCE.getName(), new AttributeModifier(ModAttributes.CRITICAL_CHANCE_UUID, "Weapon Modifier", critChance, AttributeModifier.Operation.ADDITION));
        }
        return attributes;
    }
}
