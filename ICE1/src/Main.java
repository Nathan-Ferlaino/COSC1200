import java.util.Scanner;

/**
 * Program: ICE 1
 * Description: A Program for printing information about the student
 * and repeating an input back to the user
 * Date: Jan 16th, 2025
 * @author Nathan Ferlaino
 */

public class Main {

    public static void main(String[] args) {
        float userInput = 0;

        System.out.println("Hello and welcome! Name: Nathan Ferlaino");
        System.out.println("");
        System.out.println("Banner ID: 100993560");

        System.out.println("A quote that I like is: “So many books, so little time.” ― Frank Zappa ");

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
