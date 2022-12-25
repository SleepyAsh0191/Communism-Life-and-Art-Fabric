package cn.whksoft.communism.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static cn.whksoft.communism.Communism.MOD_ID;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 12:02
 */
public class CommunismItemGroup {
    public static final ItemGroup COMMUNISM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "communism_items"), () -> new ItemStack(Food.VODKA));
}
