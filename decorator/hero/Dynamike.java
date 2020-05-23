package decorator.hero;

import decorator.hero.Hero;

public class Dynamike extends Hero {

    public Dynamike() {
        super.description = "Dynamike lobs two explosive sticks of dynamite. " +
                "His Super attack is a whole barrel full of dynamite that blows up cover!";

        super.superMoveDamage = 3080;
        super.damage = 1120;
        super.health = 3920;
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
