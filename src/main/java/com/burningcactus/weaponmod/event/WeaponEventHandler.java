package com.burningcactus.weaponmod.event;

import com.burningcactus.weaponmod.item.BattleaxeItem;
import com.burningcactus.weaponmod.item.DaggerItem;
import com.burningcactus.weaponmod.potion.ModEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;

public class WeaponEventHandler {

    private Random rand = new Random();

    @SubscribeEvent
    public void onHurtEntity(LivingHurtEvent event) {
        Entity attacker = event.getSource().getTrueSource();
        if(attacker instanceof LivingEntity) {
            ItemStack stack = ((LivingEntity) attacker).getHeldItemMainhand();
            Item item = stack.getItem();
            Entity target = event.getEntityLiving();
            float damage = event.getAmount();
            if(item instanceof BattleaxeItem) {
                if(rand.nextDouble() < 0.15D) {
//                    System.out.println("Critical hit!");
                    event.setAmount(damage * 1.5F);
                }
            }
            else if(item instanceof DaggerItem) {
                Vec3d attackerView = attacker.getLookVec();
                Vec3d targetView = target.getLookVec();
//                System.out.println("Attacker: " + attackerView.x + attackerView.y + attackerView.z + " Target: " + targetView.x + targetView.y + targetView.z);
                if(((attackerView.x > targetView.x - 0.25D && attackerView.x < targetView.x + 0.25D)) && ((attackerView.z > targetView.z - 0.25D) && attackerView.z < targetView.z + 0.25D)) {
//                    System.out.println("Backstab!");
                    event.setAmount(damage * 1.5F);
                    ((LivingEntity)target).addPotionEffect(new EffectInstance(ModEffects.BLEED, 140));
                }
            }
        }
    }
}
