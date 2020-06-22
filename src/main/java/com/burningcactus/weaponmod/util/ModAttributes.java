package com.burningcactus.weaponmod.util;

import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.RangedAttribute;

import java.util.UUID;

/**
 * This class contains the attributes added and utilized by this mod, as well as their UUID's.
 */
public class ModAttributes {

    public static final IAttribute CRITICAL_CHANCE = new RangedAttribute(null, "weapon.critChance", 0.0D, 0.0D, 1.0D);
    public static final UUID CRITICAL_CHANCE_UUID = UUID.fromString("CEE785F7-392B-4CC7-8061-3918C2077E17");

    public static final UUID EXTENDED_REACH_UUID = UUID.fromString("2110bb62-f919-4aed-983b-ab3db8652997");
}
