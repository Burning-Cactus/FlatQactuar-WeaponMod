package com.burningcactus.weaponmod.util;

import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

import java.util.UUID;

public class ModAttributes {

    public static final IAttribute CRITICAL_CHANCE = new RangedAttribute(null, "weapon.critChance", 0.0D, 0.0D, 1.0D);
    public static final IAttribute MELEE_REACH = new RangedAttribute(null, "weapon.reach", 0.0D, -3.5D, 10.0D);
    public static final UUID CRITICAL_CHANCE_UUID = UUID.fromString("CEE785F7-392B-4CC7-8061-3918C2077E17");
    public static final UUID MELEE_REACH_UUID = UUID.fromString("8b45aa3d-6e59-4bbe-b22b-fd0eb9804425");
}
