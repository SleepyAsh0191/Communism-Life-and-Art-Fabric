package cn.whksoft.communism.item;

import cn.whksoft.communism.Communism;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/25 13:01
 */
public class CommunismBannerPatternItem {
    public static Item createPattern(String name, Rarity rarity) {

        final TagKey<BannerPattern> bannerTag = TagKey.of(Registry.BANNER_PATTERN_KEY, new Identifier(Communism.MOD_ID, "pattern_item/" + name));
        final BannerPattern pattern = Registry.register(Registry.BANNER_PATTERN, new Identifier(Communism.MOD_ID, name), new BannerPattern(name));
        return Registry.register(Registry.ITEM, new Identifier(Communism.MOD_ID, name+"_banner_pattern"), new BannerPatternItem(bannerTag, new FabricItemSettings().group(CommunismItemGroup.COMMUNISM_GROUP).maxCount(1).rarity(rarity)));
    }
}
