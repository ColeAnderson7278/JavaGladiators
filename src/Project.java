public class Project {
    public static void main(String[] args) {
        Gladiator x = new Gladiator();
        x.setName("X");
        System.out.println(x.toString());
        System.out.println("Your attack damage is: " + x.getAttackDamage());
    }
}
