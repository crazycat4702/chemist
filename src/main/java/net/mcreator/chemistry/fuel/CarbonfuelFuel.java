
package net.mcreator.chemistry.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.chemistry.block.CarbonBlock;

@Mod.EventBusSubscriber
public class CarbonfuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == CarbonBlock.block.asItem())
			event.setBurnTime(1000000);
	}
}
