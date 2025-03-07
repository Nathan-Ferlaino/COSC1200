public class Vaccine {
    private int id;
    private String name;
    private double cost;
    private int availableUnits;
    private String expiryDate ;
    private String instructions;

    public Vaccine(){
        setId(0);
        setName("");
        setCost(0);
        setAvailableUnits(0);
        setExpiryDate("");
        setInstructions("");
    }

    public Vaccine(int id,String name,double cost,int availableUnits,String expiryDate, String instructions ){
        this.setId(id);
        this.setName(name);
        this.setCost(cost);
        this.setAvailableUnits(availableUnits);
        this.setExpiryDate(expiryDate);
        this.setInstructions(instructions);
    }

    public void displayVaccine(boolean isTableFormat) {
        if (isTableFormat) {
            System.out.println();
            System.out.printf("%-8s | %-10s | %-8s | %-5s | %-10s | %-20s%n", "ID", "Name", "cost", "Available Units", "Expiry Date", "Instructions");
            System.out.printf("%-8s | %-10s | %-8s | %-5s | %-10s | %-20s%n", "-".repeat(8),"-".repeat(10),"-".repeat(8), "-".repeat(5),"-".repeat(10), "-".repeat(20));
            System.out.printf("%-8d | %-10s | %-8.2f | %-5d | %-10s | %-20s%n", id, name, cost, availableUnits, expiryDate, instructions);
        } else {
            System.out.println("SKU: " + id);
            System.out.println("Vaccine Name: " + name);
            System.out.println("Unit Cost: $" + cost);
            System.out.println("Quantity on Hand: " + availableUnits);
            System.out.println("Expiry Date: " + expiryDate);
            System.out.println("Special Instructions: " + instructions);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
