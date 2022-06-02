package pers.penyo.genshindamagecalc.base;

public abstract class Artifacts {
    int hpBonus;
    int atkBonus;
    int defBonus;
    int elementalMasteryBonus;

    double critRateBonus;
    double critDMGBonus;
    double energyRechargeBonus;
    double dmgBonus;

    public abstract double skill();
}
