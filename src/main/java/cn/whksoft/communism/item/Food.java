package cn.whksoft.communism.item;

import cn.whksoft.communism.Communism;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cn.whksoft.communism.Communism.MOD_ID;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 11:38
 */
@SuppressWarnings("unused")
public class Food {
    public static final Item VODKA = registerItem("vodka", new Drinking(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .hunger(1)
                    .saturationModifier(0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600, 1), 0.8F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 0.8F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0), 0.5F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 0), 1F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(16)));

    public static final Item KVASS = registerItem("kvass", new Drinking(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .hunger(3)
                    .saturationModifier(0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0), 0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 200, 0), 0.7F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(16)));

    public static final Item CONDENSED_MILK = registerItem("condensed_milk", new Drinking(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .hunger(6)
                    .saturationModifier(0.6F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1000, 0), 0.1F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1000, 1), 0.05F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(16)));

    public static final Item OKROSHKA = registerItem("okroshka", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(7)
                    .saturationModifier(0.6F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 0.8F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1)));

    public static final Item RUSSIAN_SOUP = registerItem("russian_soup", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(8)
                    .meat()
                    .saturationModifier(0.6F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 0.8F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1)));

    public static final Item TINNED_CAVIAR = registerItem("tinned_caviar", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(2)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 160, 0), 0.5F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    public static final Item TINNED_SALMON_CAVIAR = registerItem("tinned_salmon_caviar", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(4)
                    .saturationModifier(2)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 160, 0), 0.3F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    public static final Item RYE_BREAD = registerItem("rye_bread", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.2F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    public static final Item CHOCOLATE = registerItem("chocolate", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .alwaysEdible()
                    .hunger(5)
                    .saturationModifier(0.5F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600, 1), 0.1F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    public static final Item RAW_SAUSAGE = registerItem("sausage", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .meat()
                    .hunger(4)
                    .saturationModifier(0.2F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 600, 0), 0.2F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    public static final Item COOKED_SAUSAGE = registerItem("cooked_sausage", new Item(new FabricItemSettings().food(
            new FoodComponent.Builder()
                    .meat()
                    .hunger(7)
                    .saturationModifier(0.5F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 300, 0), 0.5F)
                    .build()
    ).group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Communism.LOGGER.info("Registering Foods for " + MOD_ID);
    }
}
