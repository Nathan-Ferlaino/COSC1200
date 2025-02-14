import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String userChoice = "rock";

        /*if (userChoice.toLowerCase().trim().equals("paper")){
            System.out.println("You Won!");
        }else if((userChoice.toLowerCase().trim().equals("rock")){
            System.out.println("We tied!");
        }else{
            System.out.println("You Lost!");
        }*/
        boolean validInput = false;
        int userWinGoal = 0;
        while (!validInput){
            try {

                System.out.println("How many wins would you like to play to?");
                userWinGoal = input.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Please enter a valid choice!");
            }

        }
        boolean enoughWins = false;
        validInput = false;
        int numberOfWins = 0;
        do {
            while (!validInput){
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Rock Paper or Scissors?");
                    validInput = true;
                    userChoice = input.nextLine();
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }

            }
            switch (userChoice.toLowerCase().trim()) {
                case "paper":
                    System.out.println("You Won!");
                    numberOfWins++;
                    break;
                case "rock":
                    System.out.println("We Tied!");
                    break;
                default:
                    System.out.println("You Lost!");
            }
            validInput = false;
            if (numberOfWins == userWinGoal){
                enoughWins = true;
                System.out.println("You have " + numberOfWins + " wins which is enough to leave!");
            }
        } while (enoughWins == false);
    }
}
