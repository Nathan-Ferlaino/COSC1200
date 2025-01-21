public class PizzaSlice {
    public static void main(String[] args){
        final double MEDIUM_PIZZA_DIAMETER = 14;
        int numberOfSlices = 8;
        double pizzaRadius;
        double pizzaArea;
        double sliceArea;
        pizzaRadius = MEDIUM_PIZZA_DIAMETER / 2;
        pizzaArea = Math.PI * Math.pow(pizzaRadius, 2);
        sliceArea = Math.round(pizzaArea/numberOfSlices);
        System.out.println(sliceArea);
    }
}
