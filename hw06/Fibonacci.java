//Jake Sabatini
//March 7,2016
//Homework 6 Fib
//Print out Fibonacci Sequence

    import java.util.Scanner;
    
    public class Fibonacci{
        public static void main(String[] args){
        //call scanner
        Scanner s = new Scanner(System.in);
        //set varibales
        int first =0;
        int second =0;
        int length=0;
        
        System.out.println("Enter your number");
        
        //use while loops to make sure its an int and ask again if its not
        while(!s.hasNextInt()) {
            System.out.println("Please use an integer");
            s.next();
        }
        first = s.nextInt();
        
        while(!s.hasNextInt()) {
            System.out.println("Please use an integer");
            s.next();
        }
        second = s.nextInt();
        
        while(!s.hasNextInt()) {
            System.out.println("Please use an integer");
            s.next();
        }
        length = s.nextInt();
        
        // make int to carry out sequence
        int seq;
        
        //print out first 2 numbers to start sequence
        System.out.print(first + " " + second + " ");
        
        //use for loop to create sequence
        for(int out = 2; out<length; out++){
            seq = first + second;
            System.out.print(seq + " ");
            first = second;
            second = seq;
        }
        System.out.println(" ");
        
    
    
    
    }
}