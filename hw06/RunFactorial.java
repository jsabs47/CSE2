//Jake Sabatini
//March 7,2016
//Hw 6 Factorial
//Make a factorial calc

import java.util.Scanner;

public class RunFactorial{
    public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    int number =1;
    int fac =1;
    boolean goodInput = false;
    
    
    
    while(!goodInput){
        System.out.println("Enter your Input");
        //make sure input is a int
        while(!s.hasNextInt()){
        System.out.println("Please input an int");
        s.next();
                              }
            
            number = s.nextInt();
            //make sure input is a number between 9 and 16
            if(number >= 9 && number <=16){
                goodInput = true;
            } else {
            System.out.println("Please input a number from 9 to 16");
            }
    }
    
    //use to calculate the factorial
    for(int out=0; out<number;){
        fac *= number;
        number--;

        
    }
    
    System.out.println(fac);
    
        
    }
}