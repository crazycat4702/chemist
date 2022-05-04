package net.mcreator.chemistry.procedures;

import net.minecraft.world.GameType;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.chemistry.potion.RadiationPotionEffect;
import net.mcreator.chemistry.item.RadiationprotectionsuitItem;
import net.mcreator.chemistry.ChemistryMod;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

public class RadiationOnEffectActiveTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ChemistryMod.LOGGER.warn("Failed to load dependency entity for procedure RadiationOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!(entity instanceof LivingEntity ? (((LivingEntity) entity).getCreatureAttribute() == CreatureAttribute.UNDEAD) : false))) {
			if ((!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayerEntity) {
						return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
					} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
						NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
								.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
						return _npi != null && _npi.getGameType() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)))) {
				if ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
						: ItemStack.EMPTY).getItem() == RadiationprotectionsuitItem.helmet)) {
					if ((((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
							: ItemStack.EMPTY).getItem() == RadiationprotectionsuitItem.body)) {
						if ((((entity instanceof LivingEntity)
								? ((LivingEntity) entity)
										.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
								: ItemStack.EMPTY).getItem() == RadiationprotectionsuitItem.legs)) {
							if ((((entity instanceof LivingEntity)
									? ((LivingEntity) entity)
											.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
									: ItemStack.EMPTY).getItem() == RadiationprotectionsuitItem.boots)) {
								entity.attackEntityFrom(DamageSource.MAGIC, (float) 0);
								{
									ItemStack _ist = ((entity instanceof LivingEntity)
											? ((LivingEntity) entity).getItemStackFromSlot(
													EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
											: ItemStack.EMPTY);
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
								{
									ItemStack _ist = ((entity instanceof LivingEntity)
											? ((LivingEntity) entity).getItemStackFromSlot(
													EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
											: ItemStack.EMPTY);
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
								{
									ItemStack _ist = ((entity instanceof LivingEntity)
											? ((LivingEntity) entity).getItemStackFromSlot(
													EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
											: ItemStack.EMPTY);
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
								{
									ItemStack _ist = ((entity instanceof LivingEntity)
											? ((LivingEntity) entity).getItemStackFromSlot(
													EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
											: ItemStack.EMPTY);
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else {
								entity.attackEntityFrom(DamageSource.MAGIC, (float) ((new Object() {
									int check(Entity _entity) {
										if (_entity instanceof LivingEntity) {
											Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
											for (EffectInstance effect : effects) {
												if (effect.getPotion() == RadiationPotionEffect.potion)
													return effect.getAmplifier();
											}
										}
										return 0;
									}
								}.check(entity)) + 3));
							}
						} else {
							entity.attackEntityFrom(DamageSource.MAGIC, (float) ((new Object() {
								int check(Entity _entity) {
									if (_entity instanceof LivingEntity) {
										Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
										for (EffectInstance effect : effects) {
											if (effect.getPotion() == RadiationPotionEffect.potion)
												return effect.getAmplifier();
										}
									}
									return 0;
								}
							}.check(entity)) + 3));
						}
					} else {
						entity.attackEntityFrom(DamageSource.GENERIC, (float) ((new Object() {
							int check(Entity _entity) {
								if (_entity instanceof LivingEntity) {
									Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
									for (EffectInstance effect : effects) {
										if (effect.getPotion() == RadiationPotionEffect.potion)
											return effect.getAmplifier();
									}
								}
								return 0;
							}
						}.check(entity)) + 3));
					}
				} else {
					entity.attackEntityFrom(DamageSource.MAGIC, (float) ((new Object() {
						int check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == RadiationPotionEffect.potion)
										return effect.getAmplifier();
								}
							}
							return 0;
						}
					}.check(entity)) + 3));
				}
			}
		}
	}
}
