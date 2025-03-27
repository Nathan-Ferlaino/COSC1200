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

    public Product(){
        setProductID(0);
        setProductName("");
        setCostPerUnit(0);
        setOnHandCount(0);
        setNeededQuantity(0);
        setSpecialInstructions("");
    }

    public Product(int productID, String productName, double costPerUnit, int onHandCount, int neededQuantity, String specialInstructions){
        this.setProductID(productID);
        this.setProductName(productName);
        this.setCostPerUnit(costPerUnit);
        this.setOnHandCount(onHandCount);
        this.setNeededQuantity(neededQuantity);
        this.setSpecialInstructions(specialInstructions);
    }

    public void displayProduct(){
        System.out.println("SKU: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Cost: $" + costPerUnit);
        System.out.println("Quantity on Hand: " + onHandCount);
        System.out.println("Quantity Needed: " + neededQuantity);
        System.out.println("Special Instructions: " + specialInstructions);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public int getOnHandCount() {
        return onHandCount;
    }

    public void setOnHandCount(int onHandCount) {
        this.onHandCount = onHandCount;
    }

    public int getNeededQuantity() {
        return neededQuantity;
    }

    public void setNeededQuantity(int neededQuantity) {
        this.neededQuantity = neededQuantity;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }
}