package pers.penyo.genshindamagecalc.instance;

import pers.penyo.genshindamagecalc.base.Weapons;

public class LostPrayerToTheSacredWinds extends Weapons {
    String name = "四风原典";
    String type = "法器";

    int baseATK = 608;
    String secondaryAttribute = "暴击率";
    double value = 0.331;

    @Override
    public double skill() {
        /*
         * 无边际的眷顾
         * 移动速度提高10%；在场上每4秒获得8%/10%/12%/14%/16%元素伤害加成。
         * 该效果最多叠加4层，角色倒下或离场后清空。
         */
        return 0;
    }
}
