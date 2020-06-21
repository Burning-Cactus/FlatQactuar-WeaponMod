package com.burningcactus.weaponmod.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class DaggerItem extends SwordItem {
    public DaggerItem(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.dagger"));
    }
}
