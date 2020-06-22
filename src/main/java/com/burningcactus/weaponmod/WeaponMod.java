package com.burningcactus.weaponmod;

import com.burningcactus.weaponmod.event.WeaponEventHandler;
import com.burningcactus.weaponmod.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The main mod file.
 * The focus of this mod is to add new options for players to pick from in terms of weaponry.
 */
@Mod(WeaponMod.MODID)
public class WeaponMod {
    public static final String MODID = "weaponmod";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public WeaponMod() {
        MinecraftForge.EVENT_BUS.register(new WeaponEventHandler());
    }

}
