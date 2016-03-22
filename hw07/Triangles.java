//Jake Sabatini
//March 18, 2016
//Homework 7
//Triangles using inputs



import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean goodInput = true;
        int triangle = 0;

        while (goodInput) {
            System.out.println("Please enter an integer from 5 to 30");
            if (!s.hasNextInt()) {
                System.out.println("Please enter valid interger");
                s.next();
            }
            triangle = s.nextInt();
            if (triangle >= 5 && triangle <= 30)
                goodInput = false;
        }
        
        



        System.out.println("For Loop:");
        int forcounter = 1;

        for (int row = 0; row < triangle; row++) {
            for (int i = 0; i < forcounter; i++) {
                System.out.print(forcounter);
            }
            forcounter++;
            System.out.println("");
        }
        int forcounter2;
        forcounter2 = triangle - 1;

        for (int row = 0; row < triangle - 1; row++) {
            for (int i = 0; i < forcounter2; i++) {
                System.out.print(forcounter2);
            }
            forcounter2--;
            System.out.println("");
        }
        
        


        System.out.println("While Loop:");
        int whilerow = 0;
        int whilecounter = 1;
        while (whilerow < triangle) {
            int i = 0;

            while (i < whilecounter) {
                System.out.print(whilecounter);
                i++;
            }

            whilecounter++;
            whilerow++;
            System.out.println("");
        }

        int whilerow1 = 0;
        int whilecounter1 = triangle - 1;
        while (whilerow1 < triangle) {
            int i = 0;

            while (i < whilecounter1) {
                System.out.print(whilecounter1);
                i++;
            }

            whilecounter1--;
            whilerow1++;
            System.out.println("");
        }
        
        
        
        


        System.out.println("Do-While Loop:");
        int dorow = 0;
        int docounter = 1;
        do {
            int i = 0;
            do {
                System.out.print(docounter);
                i++;
            } while (i < docounter);
            dorow++;
            docounter++;
            System.out.println("");
        } while (dorow < triangle);

        int dorow1 = 0;
        int docounter1 = triangle - 1;
        do {
            int i = 0;
            do {
                System.out.print(docounter1);
                i++;
            } while (i < docounter1);
            dorow1++;
            docounter1--;
            System.out.println("");
        } while (dorow1 < triangle - 1);



    }
}