package com.burningcactus.weaponmod.event;

import com.burningcactus.weaponmod.enchantment.ModEnchantments;
import com.burningcactus.weaponmod.item.DaggerItem;
import com.burningcactus.weaponmod.potion.ModEffects;
import com.burningcactus.weaponmod.util.ModAttributes;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public final class WeaponEventHandler {

    private Random rand = new Random();

    /**
     * This method is called before damage is applied to the entity, so that it can change the effects and damage.
     * @param event - Event used to handle damage calculations
     */
    @SubscribeEvent
    public void onHurtEntity(LivingHurtEvent event) {
        Entity attacker = event.getSource().getTrueSource();
        if(attacker instanceof LivingEntity) {
            ItemStack stack = ((LivingEntity) attacker).getHeldItemMainhand();
            Item item = stack.getItem();
            Entity target = event.getEntityLiving();
            float damage = event.getAmount();
            if(item instanceof DaggerItem) {
                Vec3d attackerView = attacker.getLookVec();
                Vec3d targetView = target.getLookVec();
//                System.out.println("Attacker: " + attackerView.x + attackerView.y + attackerView.z + " Target: " + targetView.x + targetView.y + targetView.z);
                if(((attackerView.x > targetView.x - 0.25D && attackerView.x < targetView.x + 0.25D)) && ((attackerView.z > targetView.z - 0.25D) && attackerView.z < targetView.z + 0.25D)) {
                    System.out.println("Backstab!");
                    event.setAmount(damage + damage);
                    ((LivingEntity)target).addPotionEffect(new EffectInstance(ModEffects.BLEED, 100));
                    return;
                }
            }
            handleCrit(event, (LivingEntity) attacker, stack, damage);
        }
    }

    /**
     * Method to handle critical hits from this mod.
     * @param event - Event to handle
     * @param attacker - Entity performing the crit
     * @param item - Item being used to attack
     * @param damage - Initial damage before critical hit calculations
     */
    private void handleCrit(LivingHurtEvent event, LivingEntity attacker, ItemStack item, float damage) {
//        System.out.println(attacker.getAttribute(ModAttributes.CRITICAL_CHANCE).getValue() + (EnchantmentHelper.getEnchantmentLevel(ModEnchantments.CRITICAL_STRIKE, item) * 0.04));
        if(rand.nextDouble() < attacker.getAttribute(ModAttributes.CRITICAL_CHANCE).getValue() + (EnchantmentHelper.getEnchantmentLevel(ModEnchantments.CRITICAL_STRIKE, item) * 0.04)) {
            System.out.println("Critical hit!");
            event.setAmount(damage * 1.5F);
        }
    }

    /**
     * Register the mod's attributes to any entity that is being created.
     * @param event - Event to handle
     */
    @SubscribeEvent
    public void onEntityBuild(EntityEvent.EntityConstructing event) {
        Entity entity = event.getEntity();
        if(entity instanceof LivingEntity) {
            ((LivingEntity) entity).getAttributes().registerAttribute(ModAttributes.CRITICAL_CHANCE);
        }
    }
}
