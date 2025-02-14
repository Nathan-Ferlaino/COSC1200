/**
 * Program: Assignment 2
 * Description: A Program for determining the high, low, and median
 * temperature across a variable number of days
 * Date: Feb 14th, 2025
 * @author Nathan Ferlaino
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean validInput = false;
        int numberOfDays = 0;
        while (!validInput){
            try {
                System.out.println("How many days would you like to enter the temperature for? (between 1 and 365)");
                numberOfDays = input.nextInt();
                if(numberOfDays >= 1 && numberOfDays <= 365) {
                    validInput = true;
                }
                else{
                    System.out.println("Please enter a whole number between 1 and 365");
                }
            } catch (Exception e) {
                System.out.println("Please enter a valid choice!");
            }
        }

        double[] dayTemperaturesHigh = new double[numberOfDays];
        double[] dayTemperaturesLow = new double[numberOfDays];

        validInput = false;
        double currentTemperature = 0.0;
        for (int i = 0; i < numberOfDays; i++){
            while(!validInput){
                try {
                    System.out.println("Please enter the daily high temperature for day " + (i+1));
                    currentTemperature = input.nextFloat();
                    if(currentTemperature >= -45 && currentTemperature <= 45) {
                        dayTemperaturesHigh[i] = currentTemperature;
                        validInput = true;
                    }
                    else{
                        System.out.println("Please enter a temperature between -45 and 45 degrees");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }
            }
            validInput = false;
            while(!validInput){
                try {
                    System.out.println("Please enter the daily low temperature for day " + (i+1));
                    currentTemperature = input.nextFloat();
                    if(currentTemperature >= -45 && currentTemperature <= 45) {
                        dayTemperaturesLow[i] = currentTemperature;
                        validInput = true;
                    }
                    else{
                        System.out.println("Please enter a temperature between -45 and 45 degrees");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }
            }
            validInput = false;
        }



    }
}