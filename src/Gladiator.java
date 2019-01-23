import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    private String name;
    private Integer health = 100;
    private Integer magic = 50;
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
    }
    public void checkIfDead() {
        if (health <=0) {
            isDead = true;
        }

    }
}
