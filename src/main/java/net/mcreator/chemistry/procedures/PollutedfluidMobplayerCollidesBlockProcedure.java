package net.mcreator.chemistry.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.chemistry.potion.RadiationPotionEffect;
import net.mcreator.chemistry.ChemistryMod;

import java.util.Map;

public class PollutedfluidMobplayerCollidesBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChemistryMod.LOGGER.warn("Failed to load dependency entity for procedure PollutedfluidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEAD) : false))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(RadiationPotionEffect.potion, (int) 6500, (int) 1));
			entity.attackEntityFrom(DamageSource.MAGIC, (float) 1);
		}
	}
}
