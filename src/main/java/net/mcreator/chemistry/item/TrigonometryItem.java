
package net.mcreator.chemistry.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.chemistry.ChemistryModElements;

@ChemistryModElements.ModElement.Tag
public class TrigonometryItem extends ChemistryModElements.ModElement {
	@ObjectHolder("chemistry:trigonometry")
	public static final Item block = null;
	public TrigonometryItem(ChemistryModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ChemistryModElements.sounds.get(new ResourceLocation("chemistry:trigonometry")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("trigonometry");
		}
	}
}
