import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create welcome message
        System.out.println("\n\nHello , AttendanceApp! \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");

        //Create an output list of absences
        ArrayList<Integer> absences = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < name.length() ; i++) {
            absences.add(rand.nextInt(11));



        }
        System.out.println("The elements are: " + absences);
    }
}
