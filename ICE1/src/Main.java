/**
 * Program: ICE 1
 * Description: A Program for printing information about the student
 * and repeating an input back to the user
 * Date: Jan 16th, 2025
 * @author Nathan Ferlaino
 */
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        // Declare userInput for later use in the program
        float userInput = 0;

        // Prints out the introduction and user information
        System.out.println("Hello and welcome! Name: Nathan Ferlaino Banner ID: 100993560");
        System.out.println("A quote that I like is: “So many books, so little time.” ― Frank Zappa ");

        // Creates a variable for the exit condition and sets it to false
        boolean exitNow = false;
        // While the exit condition is false the loop will continue
        while(!exitNow){
            // Try catch to catch any errors on invalid inputs
            try{
                // Create a new scanner to get input from the user
                Scanner input = new Scanner(System.in);
                // Print the message asking the user to enter a numerical input
                System.out.print("Please enter a decimal or non-decimal number: ");
                // Take the next input from the user as a float value
                userInput = input.nextFloat();
                // If no error was caught exitNow will be set to true and the loop will exit
                exitNow = true;
            }catch (Exception e){
                // If the user's input was not a float
                System.out.println("Please enter a numerical value!");
            }
        }
        // Output the number that the user input
        System.out.println("You entered the number: " + userInput);


    }
}
