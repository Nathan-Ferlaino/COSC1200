/**
 * Program: Assignment 1
 * Description: A Program for determining the location on the
 * trajectory path of an object at a specific point in time
 * Date: Jan 31st, 2025
 * @author Nathan Ferlaino
 */

import java.util.Scanner;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        // Declare the variable for the do while loop
        boolean runAgain = true;
        // Declare the constant for acceleration due to gravity
        final double GRAVITY = 9.8;

        // Main loop utilizing a do while loop to run at least once
        do{
            // Declare variables used by the program/reset them on following runs of the program
            double positionX = 0.0;
            double positionY = 0.0;
            double initialSpeed = 0.0;
            double launchAngle = 0.0;
            double time = 0.0;

            // Declare the variable for the input validation loops and set it to false
            boolean validInput=false;


            while(!validInput){
                try{
                    // Declare the scanner object and call it input
                    Scanner input = new Scanner(System.in);
                    // Ask the user for the angle
                    System.out.println("Please enter the angle the object was launched at: ");
                    // Get the next float that the user enters as an absolute value and store it
                    launchAngle = abs(input.nextFloat());
                    // If no error was caught validInput gets set to true and the loop exits  otherwise it asks again
                    validInput = true;
                } catch (Exception e) {
                    // If an error was caught display an appropriate error message
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            // Reset validInput for the next input
            validInput = false;
            while(!validInput){
                try{
                    // Declare the scanner object and call it input
                    Scanner input = new Scanner(System.in);
                    // Ask the user for the initial speed
                    System.out.println("Please enter the initial speed of the object in m/s: ");
                    // Get the next float that the user enters as an absolute value and store it
                    initialSpeed = abs(input.nextFloat());
                    // If no error was caught validInput gets set to true and the loop exits otherwise it asks again
                    validInput = true;
                } catch (Exception e) {
                    // If an error was caught display an appropriate error message
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            // Reset validInput for the next input
            validInput = false;
            while(!validInput){
                try{
                    // Declare the scanner object and call it input
                    Scanner input = new Scanner(System.in);
                    // Ask the user for the time the position should be calculated at
                    System.out.println("Please enter the time in seconds at which the position should be calculated: ");
                    // Get the next float that the user enters as an absolute value and store it
                    time = abs(input.nextFloat());
                    // If no error was caught validInput gets set to true and the loop exits  otherwise it asks again
                    validInput = true;
                } catch (Exception e) {
                    // If an error was caught display an appropriate error message
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            // Formulas given with the assignment intructions, angles are converted to radians for use with math.cos and sin
            positionX = (initialSpeed * Math.cos(Math.toRadians(launchAngle))) * time;
            positionY = (initialSpeed * Math.sin(Math.toRadians(launchAngle)) * time) - (0.5 * GRAVITY * Math.pow(time,2));

            // Display the output to the user using printf in order to round output to two decimal places
            System.out.printf("The x position of your object at %.2f second(s) is %.2f",time, positionX);
            // Formatting
            System.out.println();
            // Display the output to the user using printf in order to round output to two decimal places
            System.out.printf("The y position of your object at %.2f second(s) is %.2f",time, positionY);
            // Formatting
            System.out.println();

            // Reset validInput
            validInput = false;
            // Declare the userChoice variable and set it to a blank value
            String userChoice = "";
            while (!validInput){
                try {
                    // Create a new scanner object called input
                    Scanner input = new Scanner(System.in);
                    // Ask the user if they would like to start the program again
                    System.out.println("Would you like to run another calculation? [Y/N]");
                    // Get the next line entered by the user
                    userChoice = input.nextLine();
                    // If no error is caught the loop will exit
                    validInput = true;
                } catch (Exception e) {
                    // Display an appropriate error message if an exception is caught
                    System.out.println("Please enter a valid character!");
                }
                // Format the user's answer to lowercase without whitespace
                switch (userChoice.toLowerCase().trim()) {
                    // Runs if the user entered Y
                    case "y":
                        // Display a message confirming the user's selection
                        System.out.println("Rerunning the program...");
                        // Set validInput to true stopping the loop
                        validInput = true;
                        // exit the switch case
                        break;
                    case "n":
                        // Display a message confirming the user's selection
                        System.out.println("Goodbye!");
                        // Set validInput to true stopping the loop
                        validInput = true;
                        // Set runAgain to false and exit the program
                        runAgain = false;
                        // exit the switch case
                        break;
                    default:
                        // If the user selected neither option they are prompted and asked again
                        System.out.println("Please enter Y or N!");
                }

            }
        }while(runAgain);
    }
}