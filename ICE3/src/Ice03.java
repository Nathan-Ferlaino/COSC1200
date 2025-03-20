import java.util.Scanner;

public class Ice03 {
    public Ice03(){
        Scanner input = new Scanner(System.in);

        boolean requireInput = true;
        int numberOfValue = -1;
        while(requireInput){
            System.out.print("How many values do you want to enter: ");
            if (input.hasNextInt()){
                numberOfValue = input.nextInt();
                if (numberOfValue>0){
                    requireInput = false;
                }else{
                    System.out.println("Please enter a positive number!");
                }
            } else{
                input.nextLine();
                System.out.println("Please enter integers only!");
            }
        }
        System.out.println(numberOfValue);

        double[] values = new double[numberOfValue];

        for(int i = 0; i < values.length; i++){
            System.out.print("Enter Value #" + (i+1) + ": ");
            while (requireInput) {
                if (input.hasNext()) {
                    String strInput = input.next().trim();
                    try {
                        System.out.println((strInput));
                        double number = Double.parseDouble(strInput);

                        if (number < 0) {
                            throw new Exception("Please enter a positive value: ");
                        }
                        if (number == double.POSITIVE_INFINITY) {
                            throw new Exception("Please enter a smaller value:");
                        }
                        requireInput = false;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a numeric value: ");
                    } catch (Exception e) {
                        System.out.print(e.getMessage());
                    }

                }
            }
        }
    }
}