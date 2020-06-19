package com.burningcactus.weaponmod.potion;

import com.burningcactus.weaponmod.WeaponMod;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WeaponMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(WeaponMod.MODID)
public class ModEffects {
    public static final Effect BLEED = null;
    @SubscribeEvent
    public static void registerEffects(RegistryEvent.Register<Effect> event) {
        event.getRegistry().registerAll(
                new BleedEffect(EffectType.HARMFUL, 0xbf0000).setRegistryName("bleed")
        );
    }
}
