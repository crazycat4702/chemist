
package net.mcreator.chemistry.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.chemistry.item.FuelItem;

@Mod.EventBusSubscriber
public class FuelfuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == FuelItem.block)
			event.setBurnTime(3000);
	}
}
