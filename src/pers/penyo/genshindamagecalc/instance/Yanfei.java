package pers.penyo.genshindamagecalc.instance;

import pers.penyo.genshindamagecalc.base.Characters;

public class Yanfei extends Characters {
    int hp;
    int atk;
    int def;
    int elementalMastery;

    double critRate;
    double critDMG;
    double energyRecharge;
    double dmg;

    @Override
    public double talent() {
        return 0;
    }

    @Override
    public double skill1() {
        return 0;
    }

    @Override
    public double skill2() {
        return 0;
    }

    @Override
    public double skill3() {
        return 0;
    }
}
