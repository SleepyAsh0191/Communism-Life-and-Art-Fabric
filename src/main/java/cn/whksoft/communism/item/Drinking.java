package cn.whksoft.communism.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 11:30
 */
public class Drinking extends Item {
    public Drinking(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}
