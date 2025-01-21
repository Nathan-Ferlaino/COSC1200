

public class Fun {
    public static void main(String args[]){
        int studentCount = 30;

        int deskCount = 30;
        int brokenDeskCount = 15;

        int usableDesk = deskCount - brokenDeskCount;
        System.out.println("Usable desks in class "+ usableDesk);

        // let's fix one brokenDesk!
        System.out.println("Fixing a broken Desk!");
        brokenDeskCount--; // brokenDeskCount = brokenDeskCount -1
        usableDesk = deskCount - brokenDeskCount;
        System.out.println("Usable Desks in class: " + usableDesk);

        System.out.println("There are currently " + studentCount + " in class!");

        //Let's enroll 15 more students!
        System.out.println("15 More students showed up!");
        //studentCount = studentCount + 15;
        studentCount+=15;
        System.out.println("There are currently " + studentCount + " in class!");

        String name = "Kyle";
        String secondName = "Kyle";
        System.out.println(name.toLowerCase().equals(secondName.toLowerCase())); // converts both names to lowercase for easier comparison
        System.out.println(name.isBlank()); // newer version of isEmpty(), trims white space
        System.out.println(name == secondName); // Not correct, is inconsistent
    }
}
