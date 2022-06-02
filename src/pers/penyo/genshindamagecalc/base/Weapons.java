package pers.penyo.genshindamagecalc.base;

public abstract class Weapons {
    String name;
    String type;

    int baseATK;
    String secondaryAttribute;
    double value;

    public abstract double skill();
}
