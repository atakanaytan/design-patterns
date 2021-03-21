package decorator.example_1.main;

import decorator.example_1.costume.SpeacialHealthBoostCostume;
import decorator.example_1.costume.SpecialDamageBoostCostume;
import decorator.example_1.hero.Hero;
import decorator.example_1.hero.Poco;

public class Main {

    public static void main(String[] args) {

        Hero hero = new Poco();
        System.out.println(hero.getDescription() +
                " \n Attack power: " + hero.attack()
                + " \n Super attack power: " + hero.superAttack()
                + " \n Healt info : " + hero.getHealthInfo());

        System.out.println("-------------------------------------------------------");

        hero = new SpeacialHealthBoostCostume(hero);

        System.out.println(hero.getDescription() +
                " \n Attack power: " + hero.attack()
                + " \n Super attack power: " + hero.superAttack()
                + " \n Healt info : " + hero.getHealthInfo());


        System.out.println("-------------------------------------------------------");

        hero = new SpecialDamageBoostCostume(hero);

        System.out.println(hero.getDescription() +
                " \n Attack power: " + hero.attack()
                + " \n Super attack power: " + hero.superAttack()
                + " \n Healt info : " + hero.getHealthInfo());
    }

}
