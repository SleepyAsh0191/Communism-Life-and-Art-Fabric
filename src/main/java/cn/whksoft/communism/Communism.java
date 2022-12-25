package cn.whksoft.communism;

import cn.whksoft.communism.item.CommonItem;
import cn.whksoft.communism.item.Disc;
import cn.whksoft.communism.item.Food;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 10:31
 */
public class Communism implements ModInitializer {

    public static String MOD_ID = "communism";
    public static final Logger LOGGER = LogManager.getLogger("Communism");
    @Override
    public void onInitialize() {
        LOGGER.info("Communism is loading...");
        Food.registerModItems();
        Disc.registerModItems();
        CommonItem.registerModItems();
    }
}
