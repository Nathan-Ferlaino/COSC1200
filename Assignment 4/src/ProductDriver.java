/**
 * Program: ProductDriver.java
 * Description: A program for creating and displaying the Information of products and perishable items
 * Date: Mar 26th, 2025
 * @author Nathan Ferlaino
 */
public class ProductDriver {

    public ProductDriver(){
        Product doormat = new Product(10001, "Doormat", 30.99, 35, 15, "Place in front of door" );
        Product lamp = new Product(10002, "Desk Lamp", 25.97, 12, 18, "Illuminate");
        Product towel = new Product(10003, "Hand Towel", 12.50, 60, 40, "Dry hand");

        PerishableProduct cucumber = new PerishableProduct();
        cucumber.setProductID(10004);
        cucumber.setProductName("Cucumber");
        cucumber.setCostPerUnit(1.27);
        cucumber.setOnHandCount(230);
        cucumber.setNeededQuantity(270);
        cucumber.setSpecialInstructions("Consume");
        cucumber.setExpirtyDate("April 4th 2025");

        PerishableProduct bellPepper = new PerishableProduct(10005, "Bell Pepper", 4.97, 320, 180, "Remove seeds and eat", "April 7th 2025");

    }

    public static void main(String[] args){
        new ProductDriver();
    }
}


