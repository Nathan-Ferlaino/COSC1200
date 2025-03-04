public class Main {
    public Main(){
        Hero link = new Hero();
        link.setName("Link");
        link.setPower(60);

        Hero mario = new Hero(name:"Mario"; power:100);

        link.display();
        mario.display();

        System.out.println(link + "\n" + mario);
    }

    public static void main(String[] args) {
        new Main();
    }
}
