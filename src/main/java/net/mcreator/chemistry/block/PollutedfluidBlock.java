
package net.mcreator.chemistry.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.property.Properties;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.StateContainer;
import net.minecraft.particles.IParticleData;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.Minecraft;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.chemistry.procedures.PollutedfluidUpdateTickProcedure;
import net.mcreator.chemistry.procedures.PollutedfluidMobplayerCollidesBlockProcedure;
import net.mcreator.chemistry.particle.RadioactiveParticle;
import net.mcreator.chemistry.ChemistryModElements;

import java.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@ChemistryModElements.ModElement.Tag
public class PollutedfluidBlock extends ChemistryModElements.ModElement {
	@ObjectHolder("chemistry:pollutedfluid")
	public static final FlowingFluidBlock block = null;
	@ObjectHolder("chemistry:pollutedfluid_bucket")
	public static final Item bucket = null;
	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;
	private ForgeFlowingFluid.Properties fluidproperties = null;

	public PollutedfluidBlock(ChemistryModElements instance) {
		super(instance, 35);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FluidRegisterHandler());
	}

	private static class FluidRegisterHandler {
		@SubscribeEvent
		public void registerFluids(RegistryEvent.Register<Fluid> event) {
			event.getRegistry().register(still);
			event.getRegistry().register(flowing);
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				CustomFluidAttributes
						.builder(new ResourceLocation("chemistry:blocks/polluted_still"), new ResourceLocation("chemistry:blocks/polluted_flow"))
						.luminosity(0).density(1000).viscosity(1000).temperature(300)

						.rarity(Rarity.COMMON).color(-16448205)).explosionResistance(100f)

								.tickRate(4).levelDecreasePerBlock(1).slopeFindDistance(4).bucket(() -> bucket).block(() -> block);
		still = (FlowingFluid) new CustomFlowingFluid.Source(fluidproperties).setRegistryName("pollutedfluid");
		flowing = (FlowingFluid) new CustomFlowingFluid.Flowing(fluidproperties).setRegistryName("pollutedfluid_flowing");
		elements.blocks
				.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.WATER).hardnessAndResistance(100f).setLightLevel(s -> 0)) {
					@Override
					public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
						return true;
					}

					@Override
					public void onBlockAdded(BlockState blockstate, World world, BlockPos pos, BlockState oldState, boolean moving) {
						super.onBlockAdded(blockstate, world, pos, oldState, moving);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();
						world.getPendingBlockTicks().scheduleTick(pos, this, 10);
					}

					@Override
					public void tick(BlockState blockstate, ServerWorld world, BlockPos pos, Random random) {
						super.tick(blockstate, world, pos, random);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();

						PollutedfluidUpdateTickProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
										new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
						world.getPendingBlockTicks().scheduleTick(pos, this, 10);
					}

					@Override
					public void onEntityCollision(BlockState blockstate, World world, BlockPos pos, Entity entity) {
						super.onEntityCollision(blockstate, world, pos, entity);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();

						PollutedfluidMobplayerCollidesBlockProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					}
				}.setRegistryName("pollutedfluid"));
		elements.items.add(() -> new BucketItem(still,
				new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.COMMON))
						.setRegistryName("pollutedfluid_bucket"));
	}

	public static abstract class CustomFlowingFluid extends ForgeFlowingFluid {
		public CustomFlowingFluid(Properties properties) {
			super(properties);
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public IParticleData getDripParticleData() {
			return RadioactiveParticle.particle;
		}

		@Override
		public Vector3d getFlow(IBlockReader world, BlockPos pos, FluidState fluidstate) {
			return super.getFlow(world, pos, fluidstate).scale(0.5);
		}

		public static class Source extends CustomFlowingFluid {
			public Source(Properties properties) {
				super(properties);
			}

			public int getLevel(FluidState state) {
				return 8;
			}

			public boolean isSource(FluidState state) {
				return true;
			}
		}

		public static class Flowing extends CustomFlowingFluid {
			public Flowing(Properties properties) {
				super(properties);
			}

			protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
				super.fillStateContainer(builder);
				builder.add(LEVEL_1_8);
			}

			public int getLevel(FluidState state) {
				return state.get(LEVEL_1_8);
			}

			public boolean isSource(FluidState state) {
				return false;
			}
		}
	}

	public static class CustomFluidAttributes extends FluidAttributes {
		public static class CustomBuilder extends FluidAttributes.Builder {
			protected CustomBuilder(ResourceLocation stillTexture, ResourceLocation flowingTexture,
					BiFunction<FluidAttributes.Builder, Fluid, FluidAttributes> factory) {
				super(stillTexture, flowingTexture, factory);
			}
		}

		protected CustomFluidAttributes(CustomFluidAttributes.Builder builder, Fluid fluid) {
			super(builder, fluid);
		}

		public static CustomBuilder builder(ResourceLocation stillTexture, ResourceLocation flowingTexture) {
			return new CustomBuilder(stillTexture, flowingTexture, CustomFluidAttributes::new);
		}

		@Override
		public int getColor(IBlockDisplayReader world, BlockPos pos) {
			return Minecraft.getInstance().world.getBiome(pos).getWaterFogColor() | 0xFF000000;
		}
	}
}
