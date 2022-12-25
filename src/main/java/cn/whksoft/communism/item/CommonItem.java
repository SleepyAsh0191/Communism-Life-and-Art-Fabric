package cn.whksoft.communism.item;

import cn.whksoft.communism.Communism;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static cn.whksoft.communism.Communism.MOD_ID;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 16:30
 */
@SuppressWarnings("unused")
public class CommonItem {

    public static final Item BEVERAGE_CAN = registerItem("beverage_can", new Item(new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP)));
    public static final Item EMPTY_TIN = registerItem("empty_tin", new Item(new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP)));
    public static final Item SAUSAGE_MOULD = registerItem("sausage_mould", new Item(new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP)));
    public static final Item CHARGING_HORN = registerItem("charging_horn", new ChargingHornItem(new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1)));
    public static final Item CCP_PATTERN_ITEM =
            CommunismBannerPatternItem.createPattern("ccp", Rarity.COMMON);
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Communism.LOGGER.info("Registering Items for " + MOD_ID);
    }
}
