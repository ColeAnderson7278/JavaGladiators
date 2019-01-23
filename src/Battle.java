import java.util.Scanner;

public class Battle {
    private Scanner user = new Scanner(System.in);
    private Gladiator fighterOne = new Gladiator();
    private Gladiator fighterTwo = new Gladiator();
    private Integer roundNumber = 1;

    public Battle(){
        setPlayerNames();
        battlePhase();
    }

    public String toString() {
        return "--------- " + "Round " + roundNumber + " ---------" + "\n " + fighterOne.toString() + "\n " + fighterTwo.toString() + "\n---------------------------";
    }

    private void setPlayerNames(){
        System.out.println("Please give forth the names of the fighters!");
        System.out.print("The first Gladiator: ");
        fighterOne.setName(user.nextLine());
        System.out.print("Now the second Gladiator: ");
        fighterTwo.setName(user.nextLine());
    }
    
    private void battlePhase(){
        while (!fighterOne.getIsDead() && !fighterTwo.getIsDead()){
            System.out.println(toString());
            if (roundNumber % 2 != 0){
                takeTurn(fighterOne, fighterTwo);
                roundNumber ++;
            }else{
                takeTurn(fighterTwo, fighterOne);
                roundNumber ++;
            }
        }
        declareWinner();
    }
    
    private void takeTurn(Gladiator attacker, Gladiator defender){
        System.out.println(attacker.getName() + "take your turn.");
        System.out.println("1)Attack 2)Do Nothing");
        String choice = user.nextLine();
        if (choice.equals("1")){
            defender.takeDamage(attacker.getAttackDamage());
        }
        else if (choice.equals("2")){
            defender.takeDamage(0);
        }takeTurn(attacker, defender);
    }
    
    private void declareWinner(){
        if (fighterOne.getIsDead()){
            System.out.println(fighterOne.getName() + " is the winner!!!");
        }else{
            System.out.println(fighterTwo.getName() + " is the winner!!!");
        }
    }
}
