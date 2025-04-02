import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String [] args){
        boolean playAgain = true;

        while(playAgain) {
            int lowerEnd = 0;
            int upperEnd = 100;
            int lifeCounter = 2;
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
                        userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess a number within the range of [" + lowerEnd + ", " + upperEnd + "] :\nLives: " + lifeCounter));
                        if ((userGuess < lowerEnd) || (userGuess > upperEnd)) {
                            JOptionPane.showMessageDialog(null, "The number is out of bounds!", "Number Guessing", JOptionPane.ERROR_MESSAGE);
                        } else {
                            isValid = true;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "That is not a valid number!", "Number Guessing", JOptionPane.ERROR_MESSAGE);
                    }
                }

                if (userGuess == magicNumber) {
                    JOptionPane.showMessageDialog(null, "You guessed correctly!");
                    breakLoop = true;
                } else if ((userGuess > lowerEnd) && (userGuess < magicNumber)) {
                    JOptionPane.showMessageDialog(null, "Too small!");
                    lowerEnd = userGuess;
                } else if ((userGuess < upperEnd) && (userGuess > magicNumber)) {
                    JOptionPane.showMessageDialog(null, "Too big!");
                    upperEnd = userGuess;
                }

                lifeCounter--;
                if (lifeCounter == 0) {
                    JOptionPane.showMessageDialog(null, "You lost! the number was: " + magicNumber);
                    breakLoop = true;
                }
            }
            boolean validInput = false;
            String userChoice = "";
            while (!validInput){
                try {
                    Scanner input = new Scanner(System.in);
                    userChoice = JOptionPane.showInputDialog("Would you like to play again? Y/N");
                    validInput = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid choice!");
                }
                switch (userChoice.toLowerCase().trim()) {
                    case "y":
                        JOptionPane.showMessageDialog(null, "Lets do it again!");
                        validInput = true;
                        break;
                    case "n":
                        JOptionPane.showMessageDialog(null, "Goodbye!");
                        validInput = true;
                        playAgain = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please enter Y or N!");
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
