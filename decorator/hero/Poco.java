package decorator.hero;

import decorator.hero.Hero;

public class Poco extends Hero {

    public Poco() {

        super.description = "Poco fires damaging sound waves at enemies." +
                " His Super can heal both Poco himself and his teammates!";
        super.superMoveDamage = 2940;
        super.damage = 980;
        super.health = 5600;
    }

    @Override
    public double attack() {
        return damage;
    }

    @Override
    public double superAttack() {
        return superMoveDamage;
    }

    @Override
    public double getHealthInfo() {
        return health;
    }
}
