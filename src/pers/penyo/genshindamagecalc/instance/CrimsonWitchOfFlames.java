package pers.penyo.genshindamagecalc.instance;

import pers.penyo.genshindamagecalc.base.Artifacts;

public class CrimsonWitchOfFlames extends Artifacts {
    int hpBonus;
    int atkBonus;
    int defBonus;
    int elementalMasteryBonus;

    double critRateBonus;
    double critDMGBonus;
    double energyRechargeBonus;
    double dmgBonus;

    @Override
    public double skill() {
        return 0;
    }
}
