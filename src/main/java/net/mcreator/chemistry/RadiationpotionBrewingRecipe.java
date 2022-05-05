
package net.mcreator.chemistry;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.chemistry.potion.RadioactivepotionPotion;
import net.mcreator.chemistry.item.FuelItem;

@ChemistryModElements.ModElement.Tag
public class RadiationpotionBrewingRecipe extends ChemistryModElements.ModElement {
	public RadiationpotionBrewingRecipe(ChemistryModElements instance) {
		super(instance, 52);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == FuelItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), RadioactivepotionPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
