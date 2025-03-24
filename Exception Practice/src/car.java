public class car {
    private String model;
    private int mileage;

    /**
     * Create an empty car with a mileage of 0
     */
    public car(){
        try{
            this.setMileage(0);
        }catch (carBreakdownRisk e){
            e.printStackTrace();
        }
    }

    /**
     * Create a car with specific mileage
     * @param mileage the mileage on the car
     * @throws carBreakdownRisk Gets thrown if the car's mileage is within the risk of breaking down
     */
    public car(int mileage) throws carBreakdownRisk{
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

    public void setMileage(int mileage)throws carBreakdownRisk {
        if (mileage > 100000){
           throw new carBreakdownRisk("The car is at risk of breaking down");
        }
        else {
            this.mileage = this.mileage;
        }
    }
}

