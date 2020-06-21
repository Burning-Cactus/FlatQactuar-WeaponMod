package com.burningcactus.weaponmod.potion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

/**
 * This effect is rather similar to the poison effect, but more dangerous.
 * It is only applied through a backstab from the dagger. or enchantment.
 */
public class BleedEffect extends Effect {
    protected BleedEffect(EffectType type, int color) {
        super(type, color);
    }

    @Override
    public void performEffect(LivingEntity entity, int amplifier) {
        entity.attackEntityFrom(DamageSource.MAGIC, 1.0F);
    }

    /**
     * checks if Potion effect is ready to be applied this tick.
     */
    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % (40 >> amplifier) == 0;
    }
}
