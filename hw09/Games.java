//Jake Sabatini
//March 27, 2016
//Homework 9
//Create 3 different games

//import scanner and random number generator
import java.util.Scanner;
import java.util.Random;

public class Games {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean goodInput = true;
        String game = "";
        //use while loop to make sure they are inputing one of the three games
        while (goodInput) {
            System.out.println("Welcome to the Jake Sabatini game center");
            System.out.println("Please pick one of the following games: guessTheBox, spinTheWheel or scrambler");
            game = s.next();
            //make sure they input exactly one of the games as shown
            if (game.equals("guessTheBox") || game.equals("spinTheWheel") || game.equals("scrambler")) {
                goodInput = false;
            }
            else {
                System.exit(1);
            }
        }
        //go to certain method of game they input
        if (game.equals("guessTheBox")) {
            guessTheBox();
        }
        else if (game.equals("spinTheWheel")) {
            spinTheWheel();
        }
        else if (game.equals("scrambler")) {
            scrambler();
        }
    }

    public static void guessTheBox() {
        Scanner s = new Scanner(System.in);
        boolean goodInput = true;
        int number = 0;
        //make sure they enter 1 2, or 3
        while (goodInput) {
            System.out.println("Please enter a number 1, 2 or, 3");
            //accept number
            number = s.nextInt();
            if (number == 1 || number == 2 || number == 3) {
                goodInput = false;
            }
        }

        //use random to create a random number from 1-3
        Random r = new Random();
        int box = r.nextInt(3) + 1;
        System.out.println(box);
        //if your number  = random number you win!!!
        if (box == number) {
            System.out.println("Congrats, you've won, your prize is an A in this course");
        }
        else {
            System.out.println("Sorry you have lost");
        }
    }


    public static void spinTheWheel() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean goodInput = true;
        boolean input = true;
        int number = 0;
        String color = "";
        String colorwin = "";
        //make sure they enter a number 1-5
        while (goodInput) {
            System.out.println("Input a number 1-5");
            number = s.nextInt();
            if (number < 6 && number > 0) {
                goodInput = false;
            }
        }
        //make sure they enter red or black
        while (input) {
            System.out.println("Please pick a color, red or black");
            color = s.next();
            // make all inputed letters lowercase and compare to lowercase versions of red and black
            color = color.toLowerCase();
            if (color.equals("red") || color.equals("black")) {
                input = false;
            }
        }
        System.out.println("Your color and number is " + color + " " + number);

        //make a random number 1-5
        int rnumber = r.nextInt(5) + 1;
        //make a random number between 1-2
        int rcolor = r.nextInt(2) + 1;
        //make red==1 and black==2
        if (rcolor == 1) {
            colorwin = "red";
        }
        else {
            colorwin = "black";
        }
        System.out.println("The winning combo is " + colorwin + " " + rnumber);
        
        
        if (number == rnumber && color.equals(colorwin)) {
            System.out.println("Congrats you win and get an A in this class");
        }
        else {
            System.out.println("Sorry you lost :(");
        }


    }

    public static void scrambler(){
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        boolean goodInput = true;
        String word = "";
        
        System.out.println("Please enter a random word");
        //accept word input
        word = s.next();
        
        //scramble word
        for(int i=0; i<word.length(); i++){
            //random numbers that replace letters with other letters and back to switch them
            int one = r.nextInt(word.length());
            Character c = word.charAt(one);
           
            word = word.replace(c,word.charAt(0));
            word =  word.replaceFirst(((Character)word.charAt(0)).toString() , c.toString());
        }
        System.out.println(word);
        
    }


}