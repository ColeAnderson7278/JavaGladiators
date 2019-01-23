import java.nio.charset.IllegalCharsetNameException;
import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    private String name;
    private Integer health = 100;
    private Integer magic = 5;
    private Integer minStrength = 10;
    private Integer maxStrength = 30;
    private Boolean isDead = false;

    public String toString() {
        return name + "\n [Health: " + health + "] [Magic: " + magic + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public Integer getMagic() {
        return magic;
    }

    public Boolean getIsDead() {
        return isDead;
    }

    public Integer getAttackDamage(){
        return ThreadLocalRandom.current().nextInt(minStrength, maxStrength + 1);
    }

    public void takeDamage(Integer attackDamage) {
        health = health - attackDamage;
        System.out.println(name + " took " + attackDamage + " point(s) of damage.");
    }

    public void healWithMagic(){
        if (magic > 0){
            health = health + ThreadLocalRandom.current().nextInt(10, 50);
            magic --;
        }
        System.out.println("You have no magic.");
    }

    public void buildUpMagic(){
        Integer magicGained = ThreadLocalRandom.current().nextInt(1, 4);
        magic = magic + magicGained;
        System.out.println("You have gain " + magicGained + " point(s) of magic.");

    }

    public void checkIfDead() {
        if (health <=0) {
            isDead = true;
        }

    }
}
