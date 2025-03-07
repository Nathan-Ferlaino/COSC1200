/**
 * Program: ICE2.java
 * Description: A program for creating a hero using the hero class
 * Date: Mar 6th, 2025
 * @author Nathan Ferlaino
 */

public class Main {
    public Main(){
        Hero link = new Hero();
        link.setName("Link");
        link.setPower(60);

        Hero mario = new Hero("Mario", 100);

        link.display();
        mario.display();

        System.out.println(link + "\n" + mario);
    }

    public static void main(String[] args) {
        new Main();
    }
}
