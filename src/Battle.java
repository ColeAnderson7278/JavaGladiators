import java.util.Scanner;

public class Battle {
    private Scanner user = new Scanner(System.in);
    private Gladiator fighterOne = new Gladiator();
    private Gladiator fighterTwo = new Gladiator();
    private Integer roundNumber = 1;

    @Override
    public String toString() {
        return "--------- " + "Round " + roundNumber + " ---------" + "\n " + fighterOne.toString() + "\n " + fighterTwo.toString() + "\n---------------------------";
    }

    public void setPlayerNames(){
        System.out.println("Please give forth the names of the fighters!");
        System.out.print("The first Gladiator: ");
        fighterOne.setName(user.nextLine());
        System.out.print("Now the second Gladiator: ");
        fighterTwo.setName(user.nextLine());
    }
}
