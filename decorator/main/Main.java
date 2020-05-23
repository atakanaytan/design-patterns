package decorator.main;

import decorator.costume.SpeacialHealthBoostCostume;
import decorator.costume.SpecialDamageBoostCostume;
import decorator.hero.Hero;
import decorator.hero.Poco;

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
