import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Add a welcome message to the attendance app
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scan.nextLine();
        System.out.println("==========Hello " + name + " Welcome to Our Attendance App=============  \n");

        //Create and then output the list of absences.
        ArrayList<Integer> absences = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < name.length(); i++) {
            absences.add(rand.nextInt(11));

        }
        System.out.println("The list of absences " + absences);

        //How many students had perfect attendance?
        System.out.println("There are " + perfAtt(absences) + " students with perfect attendance.");

        //The average of the absences
        System.out.println("The average of all the absences is: " + avg(absences, sum(absences)));
    }


    public static int perfAtt(ArrayList<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count = count + 1;

            }


        }
        return count;
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);

        }
        return sum;
    }

    public static double avg(ArrayList<Integer> list, int sum) {
        double avg = sum / list.size();

        return avg;


    }
}
