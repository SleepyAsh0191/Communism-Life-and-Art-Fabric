package cn.whksoft.communism.item;
/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 16:32
 */
import cn.whksoft.communism.sound.CommunismDiscSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class ChargingHornItem extends Item {


    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        user.playSound(CommunismDiscSounds.CHARGING_HORN_SOUND, 1.0F, 1.0F);
        user.getItemCooldownManager().set(this, 20);
        return TypedActionResult.success(itemStack, world.isClient());
    }

    public ChargingHornItem(Settings settings) {
        super(settings);
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

}
