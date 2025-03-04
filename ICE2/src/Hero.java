public class Hero{
    private String name;
    private double power;

    public Hero(){
        setName("");
        setPower(0.0);

    }

    public Hero(String name, double power){
        this.setName(name);
        this.setPower(power);
    }

    public String toString(){
        return "Name: " + this.getName() + " Power Level: " + this.getPower();
    }

    public void display(){
        System.out.println(this);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}