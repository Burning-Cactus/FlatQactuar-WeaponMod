package com.burningcactus.weaponmod.datagen.lang;

import com.burningcactus.weaponmod.ModItemGroup;
import com.burningcactus.weaponmod.WeaponMod;
import com.burningcactus.weaponmod.item.ModItems;
import com.burningcactus.weaponmod.util.ModAttributes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ENUSLangProvider extends LanguageProvider {

    public ENUSLangProvider(DataGenerator gen) {
        super(gen, WeaponMod.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        //Items
        add(ModItems.WOODEN_BATTLEAXE, "Wooden Battleaxe");
        add(ModItems.STONE_BATTLEAXE, "Stone Battleaxe");
        add(ModItems.IRON_BATTLEAXE, "Iron Battleaxe");
        add(ModItems.GOLDEN_BATTLEAXE, "Golden Battleaxe");
        add(ModItems.DIAMOND_BATTLEAXE, "Diamond Battleaxe");
        add(ModItems.WOODEN_DAGGER, "Wooden Dagger");
        add(ModItems.STONE_DAGGER, "Stone Dagger");
        add(ModItems.IRON_DAGGER, "Iron Dagger");
        add(ModItems.GOLDEN_DAGGER, "Golden Dagger");
        add(ModItems.DIAMOND_DAGGER, "Diamond Dagger");
        add(ModItems.CACTUS_SWORD, "Cactus Sword");
        //Attributes
        add("attribute.name." + ModAttributes.CRITICAL_CHANCE.getName(), "Critical Chance");
        //Item Groups
        add(ModItemGroup.WEAPON_GROUP.getTranslationKey(), "Weapons");
    }
}
