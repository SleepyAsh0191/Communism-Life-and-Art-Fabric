package cn.whksoft.communism.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cn.whksoft.communism.Communism.MOD_ID;

/**
 * @author 舞晗坤
 * @email whksoft@gmail.com
 * @since 2022/12/23 12:17
 */
public class CommunismDiscSounds {
    //国际歌（俄语）
    public static SoundEvent INTERNATIONAL_SONG = registerSoundEvent("international_song");
    //国际歌（中文）
    public static SoundEvent INTERNATIONAL_SONG_CHINESE = registerSoundEvent("international_song_chinese");
    //牢不可破的联盟
    public static SoundEvent USSR_NATIONAL_ANTHEM = registerSoundEvent("ussr_national_anthem");
    //我们是你忠诚的接班人，共青团！
    public static SoundEvent WE_ARE_YOUR_FIRM_SUCCESSORS = registerSoundEvent("we_are_your_firm_successors");
    //我们是明天的苏维埃人民
    public static SoundEvent WE_ARE_TOMORROWS_SOVIET_PEOPLE = registerSoundEvent("we_are_tomorrows_soviet_people");
    //我们胜利的卫星
    public static SoundEvent OUR_TRIUMPHANT_SATELLITE = registerSoundEvent("our_triumphant_satellite");
    //毛泽东思想永放光芒
    public static SoundEvent MAO_ZEDONG_THOUGHT_SHINES_FOREVER = registerSoundEvent("mao_zedong_thought_shines_forever");
    //莫斯科郊外的晚上
    public static SoundEvent AN_EVENING_OUTSIDE_MOSCOW = registerSoundEvent("an_evening_outside_moscow");
    //架起我的三套车
    public static SoundEvent TROIKA_GALOP = registerSoundEvent("troika_galop");
    //喀秋莎
    public static SoundEvent KATYUSHA = registerSoundEvent("katyusha");



    //冲锋号
    public static SoundEvent CHARGING_HORN_SOUND = registerSoundEvent("charging_horn");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
