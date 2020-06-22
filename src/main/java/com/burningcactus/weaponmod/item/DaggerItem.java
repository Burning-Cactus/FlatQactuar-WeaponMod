package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.util.ModAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

/**
 * The DaggerItem is a weapon that deals extra damage from behind and inflicts bleed. The reach is slightly shorter than
 * that of a regular weapon.
 */
public class DaggerItem extends SwordItem {
    private final float extendedReach;
    public DaggerItem(IItemTier tier, int power, float speed, Properties builder) {
        super(tier, power, speed, builder);
        extendedReach = -1.5F;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.dagger"));
    }

    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType slot) {
        Multimap<String, AttributeModifier> attributes = super.getAttributeModifiers(slot);
        if(slot == EquipmentSlotType.MAINHAND) {
            attributes.put(PlayerEntity.REACH_DISTANCE.getName(), new AttributeModifier(ModAttributes.EXTENDED_REACH_UUID, "Weapon modifier", extendedReach, AttributeModifier.Operation.ADDITION));
        }
        return attributes;
    }
}
