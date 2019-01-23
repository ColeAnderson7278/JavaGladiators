import java.util.concurrent.ThreadLocalRandom;

public class Gladiator {
    private String name;
    private Integer health = 100;
    private Integer magic = 50;
    private Integer minStrength = 10;
    private Integer maxStrength = 30;

    @Override
    public String toString() {
        return name + " Health: " + health + " Magic: " + magic;
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

    public Integer getAttackDamage(){
        return ThreadLocalRandom.current().nextInt(minStrength, maxStrength + 1);
    }

}
