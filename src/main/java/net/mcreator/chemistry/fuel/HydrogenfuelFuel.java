
package net.mcreator.chemistry.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.chemistry.block.HydrogenBlock;

@Mod.EventBusSubscriber
public class HydrogenfuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == HydrogenBlock.block.asItem())
			event.setBurnTime(100000);
	}
}
