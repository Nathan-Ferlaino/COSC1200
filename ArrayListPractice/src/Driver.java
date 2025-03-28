import java.util.ArrayList;

public class Driver {
    public Driver(){
        car car1 = new car(10000);
        Windows frontLeft = new Windows("Bullet Proof Glass", false, 20.2);
        car1.addWindow(frontLeft);

        Windows frontRight = new Windows("Bullet Proof Glass", true, 20);
        car1.addWindow(frontRight);

        ArrayList<Windows> listOfWindows = car1.getWindows();
        for(Windows Windows: listOfWindows){
            System.out.println(Windows.getWindowMaterial());
        }
    }
    public static void main(String[] args){
        new Driver();
    }
}
