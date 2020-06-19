package com.burningcactus.weaponmod.enchantment;

import com.burningcactus.weaponmod.WeaponMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = WeaponMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(WeaponMod.MODID)
public class ModEnchantments {
    public static final Enchantment SERRATED = null;
    public static final Enchantment CRITICAL_STRIKE = null;
    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(
                new BleedEnchantment(Enchantment.Rarity.UNCOMMON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}).setRegistryName("serrated"),
                new CritEnchantment(Enchantment.Rarity.UNCOMMON, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}).setRegistryName("critical_strike")
        );
    }
}
