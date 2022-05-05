package net.mcreator.chemistry.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.chemistry.ChemistryModElements;

import java.lang.reflect.Method;

@ChemistryModElements.ModElement.Tag
public class DoPollutedFluidSpreadGameRule extends ChemistryModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("doPollutedFluidSpread", GameRules.Category.UPDATES,
			create(false));

	public DoPollutedFluidSpreadGameRule(ChemistryModElements instance) {
		super(instance, 51);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
