/**
 * Program: Vaccine.java
 * Description: A class for setting information about a perishable product inheriting the product class
 * Date: Mar 26th, 2025
 * @author Nathan Ferlaino
 */
public class PerishableProduct extends Product{
    private String expiryDate;

    /**
     * Constructor for PerishableProduct to be used when no parameters are declared
     */
    public PerishableProduct(){
        setProductID(0);
        setProductName("");
        setCostPerUnit(0);
        setOnHandCount(0);
        setNeededQuantity(0);
        setSpecialInstructions("");
    }

    /**
     * Constructor for PerishableProduct that takes in all of the
     * paremeters from the product class as well as expiry date
     * @param productID The numerical ID of the product
     * @param productName a String containing the full name of the product
     * @param costPerUnit a double representing the price of the product
     * @param onHandCount int representing the number of items currently in stock
     * @param neededQuantity int representing the number of items that need to be ordered
     * @param specialInstructions String containing and additional information about the item
     * @param expiryDate A String containing the date that the item goes bad
     */
    public PerishableProduct(int productID, String productName, double costPerUnit, int onHandCount, int neededQuantity, String specialInstructions, String expiryDate){
        super(productID, productName, costPerUnit, onHandCount, neededQuantity, specialInstructions);
        this.setExpirtyDate(expiryDate);
    }

    /**
     * A method for returning the expiryDate of the perishable product
     * @return
     */
    public String getExpirtyDate() {
        return expiryDate;
    }

    /**
     * a Method for setting the expiryDate of the item
     * @param expirtyDate A string containing the expiry date
     */
    public void setExpirtyDate(String expirtyDate) {
        this.expiryDate = expirtyDate;
    }

    /**
     * A method that prints each parameter of the product inherited from the Product class as well as the expiry date
     */
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
