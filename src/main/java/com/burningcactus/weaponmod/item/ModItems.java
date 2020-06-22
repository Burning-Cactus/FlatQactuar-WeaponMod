package com.burningcactus.weaponmod.item;

import com.burningcactus.weaponmod.WeaponMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import static com.burningcactus.weaponmod.item.ModItemGroup.WEAPON_GROUP;

@Mod.EventBusSubscriber(modid = WeaponMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(WeaponMod.MODID)
public class ModItems {
    public static final Item WOODEN_BATTLEAXE = null;
    public static final Item STONE_BATTLEAXE = null;
    public static final Item IRON_BATTLEAXE = null;
    public static final Item GOLDEN_BATTLEAXE = null;
    public static final Item DIAMOND_BATTLEAXE = null;
    public static final Item WOODEN_DAGGER = null;
    public static final Item STONE_DAGGER = null;
    public static final Item IRON_DAGGER = null;
    public static final Item GOLDEN_DAGGER = null;
    public static final Item DIAMOND_DAGGER = null;
    public static final Item WOODEN_SPEAR = null;
    public static final Item STONE_SPEAR = null;
    public static final Item IRON_SPEAR = null;
    public static final Item GOLDEN_SPEAR = null;
    public static final Item DIAMOND_SPEAR = null;
    public static final Item CACTUS_SWORD = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BattleaxeItem(ItemTier.WOOD, 2, -2.6F, 0.15F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("wooden_battleaxe"),
                new BattleaxeItem(ItemTier.STONE, 2, -2.6F, 0.15F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("stone_battleaxe"),
                new BattleaxeItem(ItemTier.IRON, 2, -2.6F, 0.15F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("iron_battleaxe"),
                new BattleaxeItem(ItemTier.GOLD, 2, -2.6F, 0.25F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("golden_battleaxe"),
                new BattleaxeItem(ItemTier.DIAMOND, 2, -2.6F, 0.15F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("diamond_battleaxe"),
                new DaggerItem(ItemTier.WOOD, 0, -1.6F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("wooden_dagger"),
                new DaggerItem(ItemTier.STONE, 0, -1.6F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("stone_dagger"),
                new DaggerItem(ItemTier.IRON, 0, -1.6F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("iron_dagger"),
                new DaggerItem(ItemTier.GOLD, 0, -1.6F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("golden_dagger"),
                new DaggerItem(ItemTier.DIAMOND, 0, -1.6F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("diamond_dagger"),
                new SpearItem(ItemTier.WOOD, 1, -2.8F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("wooden_spear"),
                new SpearItem(ItemTier.STONE, 1, -2.8F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("stone_spear"),
                new SpearItem(ItemTier.IRON, 1, -2.8F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("iron_spear"),
                new SpearItem(ItemTier.GOLD, 1, -2.8F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("golden_spear"),
                new SpearItem(ItemTier.DIAMOND, 1, -2.8F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("diamond_spear"),
                new SwordItem(ItemTier.STONE, 3, -2.4F, new Item.Properties().group(WEAPON_GROUP)).setRegistryName("cactus_sword")
        );
    }

}
