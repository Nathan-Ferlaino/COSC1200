import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String [] args){
        boolean playAgain = true;

        while(playAgain) {
            int lowerEnd = 0;
            int upperEnd = 100;
            int lifeCounter = 5;
            Scanner input = new Scanner(System.in);
            int userGuess = 0;

            int magicNumber = (int)(Math.random() * 101);
            boolean breakLoop = false;
            while (!breakLoop) {
                userGuess = 0;
                System.out.println("Lives: " + lifeCounter);
                boolean isValid = false;
                while (!isValid) {
                    userGuess = 0;
                    try {
                        System.out.println("Guess a number within the range of [" + lowerEnd + ", " + upperEnd + "] :");
                        userGuess = input.nextInt();
                        if ((userGuess < lowerEnd) || (userGuess > upperEnd)) {
                            System.out.println("The number is out of bounds!");
                        } else {
                            isValid = true;
                        }
                    } catch (Exception e) {
                        System.out.println("That is not a valid number!");
                    }
                }

                if (userGuess == magicNumber) {
                    System.out.println("You guessed correctly!");
                    breakLoop = true;
                } else if ((userGuess > lowerEnd) && (userGuess < magicNumber)) {
                    System.out.println("Too small!");
                    lowerEnd = userGuess;
                } else if ((userGuess < upperEnd) && (userGuess > magicNumber)) {
                    System.out.println("Too big!");
                    upperEnd = userGuess;
                }

                lifeCounter--;
                if (lifeCounter == 0) {
                    System.out.println("You lost! the number was: " + magicNumber);
                    breakLoop = true;
                }
            }
            boolean validInput = false;
            String userChoice = "";
            while (!validInput){
                try {
                    System.out.println("Would you like to play again? [Y/N]");
                    userChoice = input.nextLine();
                    input.nextLine();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }
                switch (userChoice.toLowerCase().trim()) {
                    case "y":
                        System.out.println("Lets do it again!");
                        validInput = true;
                        break;
                    case "n":
                        System.out.println("Goodbye!");
                        validInput = true;
                        playAgain = false;
                        break;
                    default:
                        System.out.println("Please enter Y or N!");
                }

            }

        }

        /*while(!breakLoop){
            System.out.println("What whole number am I thinking of between "+ lowerEnd + " and " + upperEnd);
            boolean isValid = true;
            while (isValid){
                try{
                    while(!input.hasNextInt()){
                        System.out.println("That's not a valid guess, please try again");
                        input.next();
                    }
            } catch (Exception e){

                }
            breakLoop = true;
        }*/


       /* for(int i = LIFECOUNTER; i > 0 && !breakLoop; i--){
            int number = -1;
            boolean keepTrying = true;
            while (keepTrying){

                System.out.println("What whole number am I thinking of between "+ lowerEnd + " and " + upperEnd);

                while(!input.hasNextInt()){
                    System.out.println("That's not a whole number, please try again");
                    userGuess = input.nextInt();
                    }
                number = input.nextInt();
                keepTrying = false;
            }
            if(upperEnd > userGuess){
                upperEnd = userGuess;
            }else if(lowerEnd < userGuess){
                lowerEnd = userGuess;
            }else if(userGuess == magicNumber){
                System.out.println("That is correct!");
            }
            System.out.println("You have " + i +" many lives left");
        }*/
    }
}
