import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int main(String[] args) {

        // Create welcome message
        System.out.println("\n\nHello , AttendanceApp! \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");

        //Create an output list of absences
        ArrayList<Integer> absences = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < name.length(); i++) {
            absences.add(rand.nextInt(11));


        }
        System.out.println("The elements are: " + absences);

        //Number of people with perfect attendance
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (absences.get(i) == 0) {
                count = count++;

            }

        }
        return count;

        // Calculate average of absences
        double avg = average(absences);
        System.out.println("The average of absences is : " + avg);



    }
    private static int sum (ArrayList<Integer> absences){
        int sum = 0;
        for (int i = 0; i < absences.size() ; i++) {
            sum = sum + absences.get(i);

        }
        return sum;

    }

    private static double average(ArrayList<Integer> absences){
        return (double)sum(absences)/absences.size();


    }
}
