package cn.whksoft.communism.item;

import cn.whksoft.communism.Communism;
import cn.whksoft.communism.sound.CommunismDiscSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static cn.whksoft.communism.Communism.MOD_ID;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 15:18
 */
@SuppressWarnings("unused")
public class Disc {

    public static Item DISC_INTERNATIONAL_SONG = registerItem("disc_international_song",
            new MusicDiscItem(7, CommunismDiscSounds.INTERNATIONAL_SONG,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 249));
    public static Item DISC_INTERNATIONAL_SONG_CHINESE = registerItem("disc_international_song_chinese",
            new MusicDiscItem(7, CommunismDiscSounds.INTERNATIONAL_SONG_CHINESE,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 354));

    public static Item DISC_USSR_NATIONAL_ANTHEM = registerItem("disc_ussr_national_anthem",
            new MusicDiscItem(7, CommunismDiscSounds.USSR_NATIONAL_ANTHEM,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 224));

    public static Item DISC_WE_ARE_YOUR_FIRM_SUCCESSORS = registerItem("disc_we_are_your_firm_successors",
            new MusicDiscItem(7, CommunismDiscSounds.WE_ARE_YOUR_FIRM_SUCCESSORS,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 240));

    public static Item DISC_WE_ARE_TOMORROWS_SOVIET_PEOPLE = registerItem("disc_we_are_tomorrows_soviet_people",
            new MusicDiscItem(7, CommunismDiscSounds.WE_ARE_TOMORROWS_SOVIET_PEOPLE,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 166));

    public static Item DISC_OUR_TRIUMPHANT_SATELLITE = registerItem("disc_our_triumphant_satellite",
            new MusicDiscItem(7, CommunismDiscSounds.OUR_TRIUMPHANT_SATELLITE,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 135));

    public static Item DISC_MAO_ZEDONG_THOUGHT_SHINES_FOREVER = registerItem("disc_mao_zedong_thought_shines_forever",
            new MusicDiscItem(7, CommunismDiscSounds.MAO_ZEDONG_THOUGHT_SHINES_FOREVER,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 172));

    public static Item DISC_AN_EVENING_OUTSIDE_MOSCOW = registerItem("disc_an_evening_outside_moscow",
            new MusicDiscItem(7, CommunismDiscSounds.AN_EVENING_OUTSIDE_MOSCOW,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 275));

    public static Item DISC_TROIKA_GALOP = registerItem("disc_troika_galop",
            new MusicDiscItem(7, CommunismDiscSounds.TROIKA_GALOP,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 166));

    public static Item DISC_KATYUSHA = registerItem("disc_katyusha",
            new MusicDiscItem(7, CommunismDiscSounds.KATYUSHA,
                    new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(Rarity.RARE), 137));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Communism.LOGGER.info("Registering Discs for " + MOD_ID);
    }
}
