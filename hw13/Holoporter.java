//Jake Sabatini
//April 30, 2016
//Holoporter
//Do lots of things to a 3D array

import java.util.Scanner;
import java.util.Random;

public class Holoporter {
    public static void main(String[] args) {
        //fill created 3D array using coder at each spot in the array
        String[][][] temp = soRandom();
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                for (int k = 0; k < temp[i][j].length; k++) {
                    temp[i][j][k] = coder();
                }
            }
        }
        //create empty array
        String[][][] temp2 = soRandom();
        //print array
        print(temp);
        print(temp2);
        //copy over array
        temp2 = holoport(temp, temp2);
        //print copied array
        print(temp2);
        //accept code for sampling()
        Scanner s = new Scanner(System.in);
        String code = "";
        boolean input = true;
        while (input) {
            System.out.println("Please enter a code");
            code = s.next();
            if (code.length() == 6) {
                input = false;
            }
        }
        //run the rest of the methods with no return values
        sampling(temp2, code);
        percentage(temp, temp2);
        frankenstein(temp2);


    }

    public static String[][][] soRandom() {
        //create random number 1-10
        Random r = new Random();
        int length = r.nextInt(10) + 1;
        //3D is length
        String[][][] array = new String[length][][];
        //array = new String[length][][];
        //System.out.println(length);
        
        //create 2D's with random length
        for (int i = 0; i < array.length; i++) {
            int length1 = r.nextInt(10) + 1;
            //System.out.println(length1);
            array[i] = new String[length1][];

        }
        //create 1D's with random length
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int length2 = r.nextInt(10) + 1;
                //System.out.println(length2);
                array[i][j] = new String[length2];

            }


        }

        //return empty randomized 3D array
        return array;

    }

    public static String coder() {
        Random r = new Random();
        //create 4 random numbers
        int num1 = r.nextInt(9);
        int num2 = r.nextInt(9);
        int num3 = r.nextInt(9);
        int num4 = r.nextInt(9);
        //create random numbers and convert them into chars
        char chat1 = (char)(r.nextInt(25) + 65);
        char chat2 = (char)(r.nextInt(25) + 65);

        //return the code
        return "" + chat1 + chat2 + num1 + num2 + num3 + num4;
    }

    public static void print(String[][][] swagmuffin) {
        //print out array
        for (int i = 0; i < swagmuffin.length; i++) {
            //use if statements to make sure array is organized correctly to make it readable
            if (i != 0) {
                System.out.print("---");
            }
            for (int j = 0; j < swagmuffin[i].length; j++) {
                System.out.print(" [");
                for (int k = 0; k < swagmuffin[i][j].length; k++) {
                    System.out.print(swagmuffin[i][j][k]);
                    if (k != swagmuffin[i][j].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("] ");
                if (j != swagmuffin[i].length - 1) {
                    System.out.print("|");
                }
            }

        }
        System.out.println();
        //return nothing
    }

    public static String[][][] holoport(String[][][] A, String[][][] B) {
        //very messy but in general you have to account for all possibilites of how long each array will be
        // if A>B at any point in the 3D array
        // whithin this massive loops there are unecessary lines for sure but it works so im too scared to take them out
        if (A.length <= B.length) {

            for (int i = 0; i < A.length; i++) {
                //B[i] = A[i];
                if (A[i].length <= B[i].length) {
                    for (int j = 0; j < A[i].length; j++) {
                        //B[i][j] = A[i][j];
                        if (A[i][j].length < B[i][j].length) {
                            for (int k = 0; k < A[i][j].length; k++) {
                                B[i][j][k] = A[i][j][k];
                                //System.out.println(B[i][j][k]);
                            }
                        }
                        else {
                            for (int k = 0; k < B[i][j].length; k++) {
                                if (i <= A[i][j].length) {
                                    B[i][j][k] = A[i][j][k];
                                }
                                else {
                                    B[i][j][k] = "$$$$$$";
                                }
                            }
                        }
                    }
                }
                else {
                    for (int j = 0; j < B[i].length; j++) {
                        if (A[i][j].length < B[i][j].length) {
                            for (int k = 0; k < A[i][j].length; k++) {
                                B[i][j][k] = A[i][j][k];
                                //System.out.println(B[i][j][k]);
                            }
                        }
                        else {
                            for (int k = 0; k < B[i][j].length; k++) {
                                if (i <= A[i][j].length) {
                                    B[i][j][k] = A[i][j][k];
                                }
                                else {
                                    B[i][j][k] = "$$$$$$";
                                }
                            }

                        }
                    }
                }
            }
        }
        else {
            for (int i = 0; i < B.length; i++) {
                //B[i] = A[i];
                if (A[i].length <= B[i].length) {
                    for (int j = 0; j < A[i].length; j++) {
                        //B[i][j] = A[i][j];
                        if (A[i][j].length < B[i][j].length) {
                            for (int k = 0; k < A[i][j].length; k++) {
                                B[i][j][k] = A[i][j][k];
                                //System.out.println(B[i][j][k]);
                            }
                        }
                        else {
                            for (int k = 0; k < B[i][j].length; k++) {
                                if (i <= A[i][j].length) {
                                    B[i][j][k] = A[i][j][k];
                                }
                                else {
                                    B[i][j][k] = "$$$$$$";
                                }
                            }
                        }
                    }
                }
                else {
                    for (int j = 0; j < B[i].length; j++) {
                        if (A[i][j].length < B[i][j].length) {
                            for (int k = 0; k < A[i][j].length; k++) {
                                B[i][j][k] = A[i][j][k];
                                //System.out.println(B[i][j][k]);
                            }
                        }
                        else {
                            for (int k = 0; k < B[i][j].length; k++) {
                                if (i <= A[i][j].length) {
                                    B[i][j][k] = A[i][j][k];
                                }
                                else {
                                    B[i][j][k] = "$$$$$$";
                                }
                            }

                        }
                    }
                }
            }
        }
        //fill array with $ when nothing is put into those spots
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                for (int k = 0; k < B[i][j].length; k++) {
                    if (B[i][j][k] == null) {
                        B[i][j][k] = "$$$$$$";
                    }
                }
            }
        }
        //return filled array with old array and $
        return B;

    }

    public static void sampling(String[][][] B, String A) {
        //use linear search to look for a particular code in the array and print out the index
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                for (int k = 0; k < B[i][j].length; k++) {
                    //System.out.println(B[i][j][k]);
                    if (B[i][j][k].equals(A)) {
                        System.out.println(i + " " + j + " " + k);
                        return;

                    }
                }
            }
        }
        System.out.println("Code not found");
    }

    public static void percentage(String[][][] A, String[][][] B) {
        //use 2 counters and add at each spot in the array
        double counterA = 0;
        double counterB = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                for (int k = 0; k < A[i][j].length; k++) {
                    counterA++;
                }
            }
        }
        System.out.println(counterA);

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                for (int k = 0; k < B[i][j].length; k++) {
                    counterB++;
                }
            }
        }
        System.out.println(counterB);
        //determine percentage with basic math
        double percent = ((counterB-counterA)/counterA);
        percent = percent *100;
        percent = (int)percent;
        //print
        System.out.println("The percentage is : " + percent +"%");
    }
    
    public static void frankenstein(String[][][] A){
        //use insertion sorting in lab 12 to sort the array
        //3 nested loop system with while loop inside to sort
        String temp ="";
        for(int i=0; i<A.length;i++){
            for(int j=0; j<A[i].length;j++){
                for(int k=0; k<A[i][j].length;k++){
                    int swag=0;
                    
                    while(swag<A[i][j].length-1){
                        int key = A[i][j][swag].charAt(0);
                        int key2 = A[i][j][swag].charAt(1);
                        if (key == '$' || A[i][j][swag+1].charAt(0) == '$'){
                        }
                        else if(key>A[i][j][swag+1].charAt(0)){
                            
                            temp = A[i][j][swag];
                            A[i][j][swag]=A[i][j][swag+1];
                            A[i][j][swag+1] =temp;
                        }
                        else if(key2>A[i][j][swag+1].charAt(1)){
                            
                            temp = A[i][j][swag];
                            A[i][j][swag]=A[i][j][swag+1];
                            A[i][j][swag+1] =temp;
                        }
                        swag++;
                    }
                }
            }
        }
        //sort the 2D arrays by size
        for(int i=0; i<A.length;i++){
            for(int j=0; j<A[i].length;j++){
               int k=0;
               while(k<(A[i].length-1)){
                   if(A[i][k].length<=A[i][k+1].length){
                       String swap[] = A[i][k];
                       A[i][k] = A[i][k+1];
                       A[i][k+1] = swap;
                   }
                   k++;
               }
            }
        }
        //call the print function to print the new formated array
        print(A);
    }
}