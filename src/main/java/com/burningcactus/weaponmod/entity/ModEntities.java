package com.burningcactus.weaponmod.entity;

import com.burningcactus.weaponmod.WeaponMod;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WeaponMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(WeaponMod.MODID)
public class ModEntities {
    public static final EntityType<CaltropsEntity> CALTROPS = EntityType.Builder.create(CaltropsEntity::new, EntityClassification.MISC).size(0.1F, 0.1F).build("caltrops");

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(
                CALTROPS.setRegistryName("caltrops")
        );
    }
}
