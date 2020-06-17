package com.burningcactus.weaponmod.util;

import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

import java.util.UUID;

public class ModAttributes {

    public static final IAttribute CRITICAL_CHANCE = new RangedAttribute(null, "weapon.critChance", 0.0D, 0.0D, 100.0D);

    public static final UUID CRITICAL_CHANCE_UUID = UUID.fromString("CEE785F7-392B-4CC7-8061-3918C2077E17");
}
