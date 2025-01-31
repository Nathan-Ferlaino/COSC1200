import java.util.Scanner;

/**
 * Program: Assignment 1
 * Description: A Program for determining the location on the
 * trajectory path of an object at a specific point in time
 * Date: Jan 31st, 2025
 * @author Nathan Ferlaino
 */
public class Main {
    public static void main(String[] args) {
        boolean runAgain = true;
        final double GRAVITY = 9.8;
        do{
            // Declare variables used by the program/reset them on following runs of the program
            double positionX = 0.0;
            double positionY = 0.0;
            double initialVelocity = 0.0;
            double launchAngle = 0.0;
            double time = 0.0;
            boolean validInput=false;

            System.out.println("Welcome to the program, press enter to continue...");

            while(!validInput){
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter the angle the object was launched at: ");
                    launchAngle = input.nextFloat();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            // Reset validInput for the next input
            validInput = false;
            while(!validInput){
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter the initial speed of the object in m/s: ");
                    initialVelocity = input.nextFloat();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            // Reset validInput for the next input
            validInput = false;
            while(!validInput){
                try{
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter the time at which the position should be calculated: ");
                    time = input.nextFloat();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a number");
                }
            }

            positionX = (initialVelocity * Math.sin(launchAngle)) * time - (0.5) * Math.pow((GRAVITY*time),2);
            positionY = (initialVelocity * Math.cos(launchAngle)) * time;

            System.out.println("");

            validInput = false;
            String userChoice = "";
            while (!validInput){
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Would you like to run another calculation? [Y/N]");
                    userChoice = input.nextLine();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid character!");
                }
                switch (userChoice.toLowerCase().trim()) {
                    case "y":
                        System.out.println("Rerunning the program...");
                        validInput = true;
                        break;
                    case "n":
                        System.out.println("Goodbye!");
                        validInput = true;
                        runAgain = false;
                        break;
                    default:
                        System.out.println("Please enter Y or N!");
                }

            }




        }while(runAgain);
    }
}