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
    public static final EntityType<BoomerangEntity> BOOMERANG_ENTITY = EntityType.Builder.<BoomerangEntity>create(BoomerangEntity::new, EntityClassification.MISC).size(1.0F, 0.1F).build("boomerang_entity");
    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
        event.getRegistry().registerAll(
                BOOMERANG_ENTITY.setRegistryName("boomerang_entity")
        );
    }
}
