public class Triangle extends Shape {
    private int sides;
    private String name;
    double sideLength;
    public Triangle(){
        super();
        sides = 3;
    }

    public Triangle(String name, double sideLength){
        this.name = name;
        this.sideLength = sideLength;
        this.setPerimeter(sideLength * 3);
    }
    public void setPerimeter(double sideLength){
        super.setPerimeter(sideLength * 3);
    }

    public int getSides() {
        return sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
