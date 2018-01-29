import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collections;
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

        //Percentage of students who had fewer than 3 absences also had perfect attendance
        //System.out.println("The Percentage of students who had fewer than 3 absences also had perfect attendance is: " + prcnt(absences) + "%");

        //Which students had [X] absences
        ArrayList<Integer> students = students(absences, 8);
        System.out.println("These students had your indicated absences: " + students);

        //Which and what percentage of the students have FE'd the course
        ArrayList<Integer> FEs = FEs(absences, 2);
        System.out.println("These students have Fe'd the course " + FEs);

        //Add x to any absences greater than y
        ArrayList<Integer> plusList = plusList(absences, 3, 4);
        System.out.println("The list with added absences: " + plusList);

        // Sort the absences using a library function
        Collections.sort(absences);
        System.out.println("The sorted list of absences: " + absences);

        //Shuffle the absences using a library function
        Collections.shuffle(absences);
        System.out.println("The shuffled list of absences: " + absences);

        //How many of the absences are unique?
        uniAbs(absences);

        //How many of each absence value are there?
        countUnq(absences);

        // Sort the absences using a user - defined sort function
        bubbleSort(absences);
        System.out.println("The new sorted list: " + absences);

        //Sort the absences using a user - defined shuffle function
        bubbleShuffle(absences);
        System.out.println("The new shuffled list: " + absences);

        // Create and output an ArrayList of 5 distinct names
        ArrayList<String> names = new ArrayList<String>();
        names.add("Samuel");
        names.add("Chandler");
        names.add("Chibeza");
        names.add("Jenaro");
        names.add("Myles");
        System.out.println("The names in the list are: " + names);
;

    }

    private static void bubbleShuffle(ArrayList<Integer> absences) {
            Random rand = new Random();
            for (int i = 0; i < absences.size(); i++) {
                absences.set(rand.nextInt(absences.size()),i);


        }
    }

    private static void bubbleSort(ArrayList<Integer> absences) {
        for (int i = 0; i < absences.size() ; i++) {
            for (int j = 0; j < absences.size() ; j++) {
                if(absences.get(i) < absences.get(j)){
                    int temp = absences.get(i);
                    absences.set(i,absences.get(j));
                    absences.set(j,temp);
                }

            }

        }
    }

    private static void uniAbs(ArrayList<Integer> absences) {
    }

    private static void countUnq(ArrayList<Integer> absences) {

    }

    private static ArrayList<Integer> plusList(ArrayList<Integer> absences, int addend, int DaysMissed) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < absences.size(); i++) {
            if (absences.get(i) > DaysMissed) {
                list.add(absences.get(i) + addend);
            }

        }
        return list;

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

    /*public static double prcnt(ArrayList<Integer> list) {
        int count1 = 0;
        int count2 = 0;
        double pct = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 3) {
                count1 = count1 + 1;

            }
            if (list.get(i) == 0) {
                count2 = count2 + 1;
            }

            pct = pct + (count2 / count1) * 100;

        }
        return pct;*/


    public static ArrayList<Integer> students(ArrayList<Integer> absences, int NumOfMissedDays) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < absences.size(); i++) {
            if (absences.get(i) >= NumOfMissedDays) {
                list.add(i);
            }


        }
        return list;


    }

    public static ArrayList<Integer> FEs(ArrayList<Integer> absences, int TimesMetAWeek) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < absences.size(); i++) {
            if (absences.get(i) <= (2 * TimesMetAWeek)) {
                list.add(i);

            }

        }
        return list;
    }
}










