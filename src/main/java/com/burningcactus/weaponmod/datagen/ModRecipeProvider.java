package com.burningcactus.weaponmod.datagen;

import com.burningcactus.weaponmod.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        buildBattleAxe(consumer, ModItems.WOODEN_BATTLEAXE, ItemTags.PLANKS);
        buildBattleAxe(consumer, ModItems.STONE_BATTLEAXE, Blocks.COBBLESTONE);
        buildBattleAxe(consumer, ModItems.IRON_BATTLEAXE, Items.IRON_INGOT);
        buildBattleAxe(consumer, ModItems.GOLDEN_BATTLEAXE, Items.GOLD_INGOT);
        buildBattleAxe(consumer, ModItems.DIAMOND_BATTLEAXE, Items.DIAMOND);
        buildDagger(consumer, ModItems.WOODEN_DAGGER, ItemTags.PLANKS);
        buildDagger(consumer, ModItems.STONE_DAGGER, Blocks.COBBLESTONE);
        buildDagger(consumer, ModItems.IRON_DAGGER, Items.IRON_INGOT);
        buildDagger(consumer, ModItems.GOLDEN_DAGGER, Items.GOLD_INGOT);
        buildDagger(consumer, ModItems.DIAMOND_DAGGER, Items.DIAMOND);
        buildSword(consumer, ModItems.CACTUS_SWORD, Blocks.CACTUS);
    }

    private void buildDagger(Consumer<IFinishedRecipe> consumer, IItemProvider result, IItemProvider material) {
        ShapedRecipeBuilder.shapedRecipe(result)
                .key('#', material)
                .key('$', Tags.Items.RODS_WOODEN)
                .patternLine("#")
                .patternLine("$")
                .addCriterion("has_material", this.hasItem(material))
                .build(consumer);
    }

    private void buildDagger(Consumer<IFinishedRecipe> consumer, IItemProvider result, Tag<Item> material) {
        ShapedRecipeBuilder.shapedRecipe(result)
                .key('#', material)
                .key('$', Tags.Items.RODS_WOODEN)
                .patternLine("#")
                .patternLine("$")
                .addCriterion("has_material", this.hasItem(material))
                .build(consumer);
    }

    private void buildBattleAxe(Consumer<IFinishedRecipe> consumer, IItemProvider result, IItemProvider material) {
        ShapedRecipeBuilder.shapedRecipe(result)
                .key('#', material)
                .key('$', Tags.Items.RODS_WOODEN)
                .patternLine("#$#")
                .patternLine("#$#")
                .patternLine(" $ ")
                .addCriterion("has_material", this.hasItem(material))
                .build(consumer);
    }

    private void buildBattleAxe(Consumer<IFinishedRecipe> consumer, IItemProvider result, Tag<Item> material) {
        ShapedRecipeBuilder.shapedRecipe(result)
                .key('#', material)
                .key('$', Tags.Items.RODS_WOODEN)
                .patternLine("#$#")
                .patternLine("#$#")
                .patternLine(" $ ")
                .addCriterion("has_material", this.hasItem(material))
                .build(consumer);
    }

    private void buildSword(Consumer<IFinishedRecipe> consumer, IItemProvider result, IItemProvider material) {
        ShapedRecipeBuilder.shapedRecipe(result)
                .key('#', material)
                .key('$', Tags.Items.RODS_WOODEN)
                .patternLine("#")
                .patternLine("#")
                .patternLine("$")
                .addCriterion("has_material", this.hasItem(material))
                .build(consumer);
    }
}
