import java.util.Scanner;

public class ScannerPr {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        double fahrenheit;
        double celsius;
        System.out.println("Enter the farenheit temperature: ");
        fahrenheit = input.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        // % is a variable being inserted, 0.2 is what its rounded to
        System.out.printf("%30.2f Fahrenheit is %.2f Celsius", fahrenheit, celsius);
    }
}
