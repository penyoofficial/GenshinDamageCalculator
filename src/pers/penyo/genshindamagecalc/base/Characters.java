package pers.penyo.genshindamagecalc.base;

public abstract class Characters {
    int hp;
    int atk;
    int def;
    int elementalMastery;

    double critRate;
    double critDMG;
    double energyRecharge;
    double dmg;

    public abstract double skill();
}
