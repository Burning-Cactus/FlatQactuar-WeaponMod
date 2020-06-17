package com.burningcactus.weaponmod.potion;

import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

//This effect is rather similar to the poison effect, but more dangerous. It is only applied through a backstab from the dagger.
public class BleedEffect extends Effect {
    protected BleedEffect(EffectType type, int color) {
        super(type, color);
    }
}
