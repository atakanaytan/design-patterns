package decorator.costume;

import decorator.hero.Hero;

public class SpecialDamageBoostCostume extends HeroCostumes {

    Hero hero;

    public SpecialDamageBoostCostume(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + " Equipped with special damage booster costume";
    }

    @Override
    public double attack() {
        return 80 + hero.attack();
    }

    @Override
    public double superAttack() {
        return hero.superAttack();
    }

    @Override
    public double getHealthInfo() {
        return 40 + hero.getHealthInfo();
    }
}
