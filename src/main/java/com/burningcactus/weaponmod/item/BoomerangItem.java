package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.entity.BoomerangEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.Set;

public class BoomerangItem extends Item implements IProjectile {
    private final int attack;
    private final int maxTargets;
    private Set<Entity> targets;
    public BoomerangItem(int power, int targets, Properties properties) {
        super(properties);
        this.attack = power;
        this.maxTargets = targets;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 72000;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getHeldItem(handIn);
        return ActionResult.resultConsume(stack);
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack stack, World worldIn, LivingEntity entityLiving, int timeLeft) {
//        if(!worldIn.isRemote) {
//            BoomerangEntity boomerang = new BoomerangEntity(playerIn, worldIn);
//            boomerang.shoot(0.0F, playerIn.rotationPitch, playerIn.rotationYaw, 1.2F, 2.0F);
//            worldIn.addEntity(boomerang);
//        }
        stack.shrink(1);
    }

    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {

    }
}
