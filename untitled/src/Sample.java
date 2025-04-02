import javax.swing.*;
import javax.swing.JOptionPane;

public class Sample{

    public static void main(String[] args){
        new Sample();
    }

    public Sample(){
        JOptionPane.showMessageDialog(null, "Test");
        JOptionPane.showMessageDialog(null, "Test", "Title goes here", JOptionPane.ERROR_MESSAGE);
        String something = JOptionPane.showInputDialog("TEST Something");
        System.out.println(something);

        int choice = JOptionPane.showConfirmDialog(null, "Are You Sure", "Really?", JOptionPane.YES_NO_OPTION);

    }

}