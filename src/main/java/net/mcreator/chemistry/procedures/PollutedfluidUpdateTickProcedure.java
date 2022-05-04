package net.mcreator.chemistry.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.chemistry.block.PollutedfluidBlock;
import net.mcreator.chemistry.ChemistryMod;

import java.util.Map;

public class PollutedfluidUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChemistryMod.LOGGER.warn("Failed to load dependency entity for procedure PollutedfluidUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				ChemistryMod.LOGGER.warn("Failed to load dependency x for procedure PollutedfluidUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				ChemistryMod.LOGGER.warn("Failed to load dependency y for procedure PollutedfluidUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				ChemistryMod.LOGGER.warn("Failed to load dependency z for procedure PollutedfluidUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ChemistryMod.LOGGER.warn("Failed to load dependency world for procedure PollutedfluidUpdateTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (true) {
			if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlockState()).getBlock() == Blocks.WATER)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) z);
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			} else if (((world.getFluidState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))).getBlockState())
					.getBlock() == Blocks.WATER)) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Message"), (false));
				}
				{
					BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1));
					BlockState _bs = PollutedfluidBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlockState(_bp, _bs, 3);
				}
			}
		}
	}
}
