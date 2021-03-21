package decorator.example_1.costume;

import decorator.example_1.hero.Hero;

public class SpeacialHealthBoostCostume extends HeroCostumes {

    Hero hero;

    public SpeacialHealthBoostCostume(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getDescription() {
        return hero.getDescription() + " Equipped with special health booster costume";
    }

    @Override
    public double attack() {
        return hero.attack();
    }

    @Override
    public double superAttack() {
        return hero.superAttack();
    }

    @Override
    public double getHealthInfo() {
        return 200 + hero.getHealthInfo();
    }
}
