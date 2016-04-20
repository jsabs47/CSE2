//Jake Sabatini
//Hw 11
//This program will take 15 grades of exams and sort them, then will search for a specific grade


//import everything needed
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class CSE2Linear {
    public static void main(String[] args) {
        //declare array
        int[] myGrades = new int[15];
        System.out.println("Please enter 15 grades as ints");
        //declare scanner
        Scanner scan = new Scanner(System.in);

        // =use for error 3
        int gradenum = 0;
        //use for loop to accept grades inputed
        for (int i = 0; i < myGrades.length; i++) {

            scan = new Scanner(System.in);
            //if not an integer
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Not an integer.");
            }

            int num = scan.nextInt();

            if (num < 101 && num > -1) {
                myGrades[i] = num;
                //third errr condition
                if (num >= gradenum) {
                    gradenum = num;
                }
                else {
                    System.out.println("Error, your last input has to be equal to or greater than the last");
                }
            }
            
            //if not btwn 0-100
            else if (num > 100 || num < 0) {
                System.out.println("Grade has to be between 0-100.");

            }

            



        }
        //print array
        System.out.println("Unsorted arary: ");
        //use arrays.tostring to print one dimensional array
        System.out.println(Arrays.toString(myGrades));

        int sort = 0;
        //sort array
        for (int i = 0; i < myGrades.length - 1; i++) {
            for (int j = i + 1; j < myGrades.length; j++) {
                if (myGrades[i] > myGrades[j]) {
                    sort = myGrades[i];
                    myGrades[i] = myGrades[j];
                    myGrades[j] = sort;
                }
            }
        }


        System.out.println("Sorted array: ");
        //use arrays.tostring bc one dimensional array
        System.out.println(Arrays.toString(myGrades));

        //linear search
        System.out.println("Enter a grade to search for : ");
        int search = scan.nextInt();
        boolean input = false;
        int count = 0;
        for (int i = 0; i < myGrades.length; i++) {
            count++;
            if (myGrades[i] == search) {
                input = true;
                break;
            }
        }
        if (input) {
            System.out.println(search + " is in the array.");
            System.out.println("Iterations used: " + count);
        }
        else {
            System.out.println(search + " is not in the array.");
            System.out.println("Iterations used: " + count);

        }


        //scramble
        for (int i = 0; i < myGrades.length; i++) {
            int num = i + (int)(Math.random() * (myGrades.length - i));
            int val = myGrades[num];
            myGrades[num] = myGrades[i];
            myGrades[i] = val;
        }

        System.out.println("Scrambled array:");
        //use same function to print out array
        System.out.println(Arrays.toString(myGrades));

        //Linear search for scrambled array.
        System.out.println("Enter a grade to search for: ");
        search = scan.nextInt();
        input = false;
        count = 0;
        for (int i = 0; i < myGrades.length; i++) {
            count++;
            if (myGrades[i] == search) {
                input = true;
                break;
            }
        }
        if (input) {
            System.out.println(search + " is in the array");
            System.out.println("Iterations used: " + count);
        }
        else {
            System.out.println(search + " not in array");
            System.out.println("Iterations used: " + count);

        }
    }
}