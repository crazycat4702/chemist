
package net.mcreator.chemistry.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.chemistry.itemgroup.ElementItemGroup;
import net.mcreator.chemistry.ChemistryModElements;

import java.util.List;
import java.util.Collections;

@ChemistryModElements.ModElement.Tag
public class MagnesiumBlock extends ChemistryModElements.ModElement {
	@ObjectHolder("chemistry:magnesium")
	public static final Block block = null;
	public MagnesiumBlock(ChemistryModElements instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ElementItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0).harvestLevel(2)
					.harvestTool(ToolType.HOE).setRequiresTool());
			setRegistryName("magnesium");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
