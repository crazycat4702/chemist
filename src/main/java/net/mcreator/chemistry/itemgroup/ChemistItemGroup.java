
package net.mcreator.chemistry.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.chemistry.item.ChemistryItem;
import net.mcreator.chemistry.ChemistryModElements;

@ChemistryModElements.ModElement.Tag
public class ChemistItemGroup extends ChemistryModElements.ModElement {
	public ChemistItemGroup(ChemistryModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabchemist") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ChemistryItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
