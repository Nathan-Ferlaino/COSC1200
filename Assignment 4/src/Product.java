/**
 * Program: Vaccine.java
 * Description: A class for setting information about a product and displaying it in a non-liner format
 * Date: Mar 26th, 2025
 * @author Nathan Ferlaino
 */
public class Product {
    private int productID;
    private String productName;
    private double costPerUnit;
    private int onHandCount;
    private int neededQuantity;
    private String specialInstructions;

    /**
     * Default constructor for the Product class
     */
    public Product(){
        setProductID(0);
        setProductName("");
        setCostPerUnit(0);
        setOnHandCount(0);
        setNeededQuantity(0);
        setSpecialInstructions("");
    }

    /**
     * Constructor for Product that takes in all the relevant parameters
     * for a product
     * @param productID The numerical ID of the product
     * @param productName a String containing the full name of the product
     * @param costPerUnit a double representing the price of the product
     * @param onHandCount int representing the number of items currently in stock
     * @param neededQuantity int representing the number of items that need to be ordered
     * @param specialInstructions String containing and additional information about the item
     */
    public Product(int productID, String productName, double costPerUnit, int onHandCount, int neededQuantity, String specialInstructions){
        this.setProductID(productID);
        this.setProductName(productName);
        this.setCostPerUnit(costPerUnit);
        this.setOnHandCount(onHandCount);
        this.setNeededQuantity(neededQuantity);
        this.setSpecialInstructions(specialInstructions);
    }

    /**
     * Displays all parameters of the product in a non-linear labeled format
     */
    public void displayProduct(){
        System.out.println("SKU: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Cost: $" + costPerUnit);
        System.out.println("Quantity on Hand: " + onHandCount);
        System.out.println("Quantity Needed: " + neededQuantity);
        System.out.println("Special Instructions: " + specialInstructions);
    }

    /**
     * Get the ID of the product
     * @return Return an int with the product ID
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Set the ID of the product
     * @param productID The ID of the product as an int
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * Get the name of the product
     * @return A String containing the name of the product
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Set the name of the product
     * @param productName A string containing the name of the product
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Return the cost of the product per unit
     * @return An int representing the dollar amount that it costs for each unit
     */
    public double getCostPerUnit() {
        return costPerUnit;
    }

    /**
     * Set the cost per unit of the product
     * @param costPerUnit An int representing the dollar amount that it costs for each unit
     */
    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    /**
     * Get the amount of items currently on hand (in stock_
     * @return the amount of the product on hand as an int
     */
    public int getOnHandCount() {
        return onHandCount;
    }

    /**
     * Set the amount of the product currently on hand
     * @param onHandCount The amount of the product on hand as an int
     */
    public void setOnHandCount(int onHandCount) {
        this.onHandCount = onHandCount;
    }

    /**
     * Get the number of items that need to be ordered
     * @return int representing the amount of the product that is needed
     */
    public int getNeededQuantity() {
        return neededQuantity;
    }

    /**
     * Set the amount of the product that needs to be ordered
     * @param neededQuantity int representing the amount of the product that is needed
     */
    public void setNeededQuantity(int neededQuantity) {
        this.neededQuantity = neededQuantity;
    }

    /**
     * Get any special instructions relating to the item
     * @return A string containing special instructions for the item
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Set any special instructions relating to the item
     * @param specialInstructions A string containing special instructions for the item
     */
    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }
}