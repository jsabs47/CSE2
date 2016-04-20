//Jake Sabatini
//hw12
//april 18, 2016
//RemoveElements

//import stuff
import java.util.Scanner;
import java.util.Random;

public class RemoveElements {
    public static void main(String[] arg) {

        //given code 
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        int array1[];
        int array2[];
        int input, num1;
        String answer = "";


        //do statement
        do {
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
            String out = "The original array is:";
            out += listArray(num);
            System.out.println(out);

            //index
            System.out.print("Enter the index ");
            input = scan.nextInt();
            array1 = delete(num, input);
            String out1 = "The output array is ";
            out1 += listArray(array1); //return a string
            System.out.println(out1);

            //target value
            System.out.print("Enter the target value ");
            num1 = scan.nextInt();
            array2 = remove(num, num1);
            String out2 = "The output array is ";
            out2 += listArray(array2); //return a string of the form "{2, 3, -9}"  
            System.out.println(out2);
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer = scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }

    public static String listArray(int num[]) {
            String out = "{";
            for (int j = 0; j < num.length; j++) {
                if (j > 0) {
                    out += ", ";
                }
                out += num[j];
            }
            out += "} ";
            return out;
        }


    public static int[] remove(int list[], int target) {
        int number = 0;
        int count = 0;
        //find num how many times in array
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                number++;
            }
        }

        //new array 
        int removed[] = new int[list.length - number];

        //for loop to increment
        for (int i = 0; i < removed.length; i++) {
            //control structure
            if (list[i] == target) {
                count++;
                removed[i] = list[i + count];
            }
            else {
                removed[i] = list[i + count];
            }
        }
        //new array
        return removed;
    }

    //Method genereate random int 0-9 
    public static int[] randomInput() {
        int random[] = new int[10];
        Random rand = new Random();
        //rand int from 0-9
        for (int i = 0; i < 10; i++) {
            random[i] = rand.nextInt(9);
        }
        //return to main
        return random;
    }
    public static int[] delete(int list[], int position) {
            //This method wil decrease in size by 1
            int deleted[] = new int[list.length - 1];
            for (int i = 0; i < deleted.length; i++) {
                if (i >= position) {
                    deleted[i] = list[i + 1];
                }
                else {
                    deleted[i] = list[i];
                }
            }
            return deleted;
        }



}