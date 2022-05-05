
package net.mcreator.chemistry.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.chemistry.itemgroup.ChemistItemGroup;
import net.mcreator.chemistry.ChemistryModElements;

@ChemistryModElements.ModElement.Tag
public class NucleusItem extends ChemistryModElements.ModElement {
	@ObjectHolder("chemistry:nucleus")
	public static final Item block = null;

	public NucleusItem(ChemistryModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ChemistItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("nucleus");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
