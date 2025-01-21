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
        System.out.println("Hello and welcome!\nName: Nathan Ferlaino\nBanner ID: 100993560");
        System.out.println("A quote that I like is: “So many books, so little time.” ― Frank Zappa ");

        // Creates a variable for the exit condition and sets it to false
        boolean exitNow = false;
        while(!exitNow){
            try{
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter a decimal or non-decimal number: ");
                userInput = input.nextFloat();
                exitNow = true;
            }catch (Exception e){
                System.out.println("Please enter a numerical value!");
            }
        }
        System.out.println("You entered the number: " + userInput);


    }
}
