package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class CaltropsItem extends Item {
    public CaltropsItem(Properties builder) {
        super(builder);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        if(!worldIn.isRemote) {
            EntityType type = ModEntities.CALTROPS;
        }
        return ActionResult.resultSuccess(item);
    }

}
