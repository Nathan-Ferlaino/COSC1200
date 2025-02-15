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

        // Set the condition for the while loop to false
        boolean validInput = false;

        // Set the variable for user's input to an initial value of 0
        int numberOfDays = 0;
        // Set the condition of the while loop to valid input being true
        while (!validInput){
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("How many days would you like to enter the temperature for? (between 1 and 365)");
                // Get the next int from the user's input
                numberOfDays = input.nextInt();
                // if the input is within the valid range (1-365) then set validInput to true
                if(numberOfDays >= 1 && numberOfDays <= 365) {
                    validInput = true;
                }
                // If the input is outside the valid range, show an appropriate message and ask again
                else{
                    System.out.println("Please enter a whole number between 1 and 365");
                }
            } catch (Exception e) {
                // If the user enters a value that is not an int the error will be caught and an error message will be displayed
                System.out.println("Please enter a valid choice!");
            }
        }

        // Declare low and high arrays with a length equal to the number of days defined by the user
        double[] dayTemperaturesHigh = new double[numberOfDays];
        double[] dayTemperaturesLow = new double[numberOfDays];

        validInput = false;
        double currentTemperature = 0.0;
        // For loop to iterate through each element in the arrays
        for (int i = 0; i < numberOfDays; i++){
            while(!validInput){
                try {
                    Scanner input = new Scanner(System.in);
                    // Ask the user for the temperature of the current day and store that in currentTemperature
                    System.out.println("Please enter the daily high temperature for day " + (i+1));
                    currentTemperature = input.nextFloat();
                    // If the user's input is within the valid range store it in the element equal to the current for loop iteration
                    if(currentTemperature >= -45 && currentTemperature <= 45) {
                        dayTemperaturesHigh[i] = currentTemperature;
                        validInput = true;
                    }
                    // If the user's input was invalid display a relevant message
                    else{
                        System.out.println("Please enter a temperature between -45 and 45 degrees");
                    }
                } catch (Exception e) {
                    // Catch and print a message if the user entered an invalid input
                    System.out.println("Please enter a valid choice!");
                }
            }
            // Repeat the above code but with the lowest temperature for the given day
            validInput = false;
            while(!validInput){
                try {
                    Scanner input = new Scanner(System.in);
                    System.out.println("Please enter the daily low temperature for day " + (i+1));
                    currentTemperature = input.nextFloat();
                    // Check to make sure the temperature is not higher than the daily high
                    if(currentTemperature > dayTemperaturesHigh[i]) {
                        System.out.println("The daily low cannot be larger than the daily high");
                    }
                    else if (currentTemperature >= -45 && currentTemperature <= 45){
                        dayTemperaturesLow[i] = currentTemperature;
                        validInput = true;
                    } else {
                        System.out.println("Please enter a temperature between -45 and 45 degrees");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid choice!");
                }
            }
            validInput = false;
        }

        // Create a new array for storing the average values for each day
        double[] dailyAverageTemperature = new double[numberOfDays];
        double overallAverage = 0.0;

        // Iterate equal to the numberOfDays being stored
        for(int i = 0; i < numberOfDays;i++){
            // For each day, grab the high and low temp from that day, average it, and store it in dailyAverageTemperature
            dailyAverageTemperature[i] = (dayTemperaturesHigh[i] + dayTemperaturesLow[i])/2;
            // Display a message showing the average temperature on that day rounded to 2 decimal places
            System.out.printf("The average temperature on day %d was %.2f Degrees",(i+1), dailyAverageTemperature[i]);
            // add the temperature to the running total
            overallAverage += dailyAverageTemperature[i];
        }
        // Divide the running total by the number of days to get the average temp across all days
        overallAverage = overallAverage/numberOfDays;

        // Set the highest and lowest temperature to the first value in each array as a starting point
        double highestTemperature = dayTemperaturesHigh[0];
        double lowestTemperature = dayTemperaturesLow[0];
        // For loop for finding the highest and lowest stored temperature
        for(int i = 0; i < numberOfDays; i++) {
            // If the next value is higher than the currently stored value, set highestTemperature equal to the new value
            if (dayTemperaturesHigh[i] > highestTemperature) {
                highestTemperature = dayTemperaturesHigh[i];
            }
            // If the next value is lower than the currently stored value, set lowestTemperature equal to the new value
            if (dayTemperaturesLow[i] < lowestTemperature) {
                lowestTemperature = dayTemperaturesLow[i];
            }
        }

        System.out.printf("The highest temperature recorded was %.2f Degrees", highestTemperature);
        System.out.printf("The lowest temperature recorded was %.2f Degrees", lowestTemperature);
        System.out.printf("The average temperature across all days was %.2f Degrees", overallAverage);

    }
}
