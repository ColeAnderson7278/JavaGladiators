import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    private String name;
    private Integer health = 100;
    private Integer magic = 5;
    private Integer minStrength = 10;
    private Integer maxStrength = 30;
    private Integer maxHealth = 150;
    private Integer maxMagic = 5;
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
        if (magic > 0 && health < maxHealth){
            Integer magicHealth = ThreadLocalRandom.current().nextInt(10, 50);
            if ((health + magicHealth) < 150){
                health = health + magicHealth;
            }else{
                health = 150;
            }
            magic --;
            System.out.println("Your have been healed " + magicHealth + " health points.");
        } System.out.println("You can not heal right now.");
    }

    public void buildUpMagic(){
        Integer magicGained = ThreadLocalRandom.current().nextInt(1, 4);
        magic = magic + magicGained;
        if (magic > maxMagic){
            magic = maxMagic;
            System.out.println("You have a maximum amount of magic.");
        }else{
            System.out.println("You have gain " + magicGained + " point(s) of magic.");
        }

    }

    public void checkIfDead() {
        if (health <=0) {
            isDead = true;
        }

    }
}
