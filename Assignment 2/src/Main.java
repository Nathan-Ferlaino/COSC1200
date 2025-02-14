import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        double[] dayTemperatures = new double[numberOfDays];

        validInput = false;
        double currentTemperature = 0.0;
        for (int i = 0; i < dayTemperatures.length; i++){
            while(!validInput){
                try {
                    System.out.println("Please enter the temperature for day " + (i+1));
                    currentTemperature = input.nextFloat();
                    if(currentTemperature >= -45 && currentTemperature <= 45) {
                        dayTemperatures[i] = currentTemperature;
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