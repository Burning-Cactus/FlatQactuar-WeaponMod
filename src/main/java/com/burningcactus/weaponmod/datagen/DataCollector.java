package com.burningcactus.weaponmod.datagen;

import com.burningcactus.weaponmod.WeaponMod;
import com.burningcactus.weaponmod.datagen.lang.ENUSLangProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = WeaponMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataCollector {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        generator.addProvider(new ENUSLangProvider(generator));
        generator.addProvider(new ModRecipeProvider(generator));
    }
}
