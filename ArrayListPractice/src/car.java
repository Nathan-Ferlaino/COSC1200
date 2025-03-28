import java.util.ArrayList;

public class car {
    private String model;
    private int mileage;
    ArrayList<Windows> windows;
    private ArrayList<Windows> Windows;

    /**
     * Create an empty car with a mileage of 0
     */
    public car(){
        this.setMileage(0);
        windows = new ArrayList<>();
    }

    public ArrayList<Windows> getWindows(){
        return this.Windows;
    }

    public void addWindow(Windows window){
        this.Windows.add(window);
    }

    /**
     * Create a car with specific mileage
     * @param mileage the mileage on the car
     */
    public car(int mileage){
        this();
        this.setMileage(mileage);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage){
        this.mileage = this.mileage;
    }
}

