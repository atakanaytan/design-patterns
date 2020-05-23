package decorator.hero;

public abstract class Hero {

    String description = "Unknown Hero";
    int superMoveDamage = 0;
    int damage = 0;
    int health = 0;

    public abstract double attack();

    public abstract double superAttack();

    public abstract double getHealthInfo();

    public String getDescription(){
        return description;
    }
}
