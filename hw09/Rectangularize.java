//Jake Sabatini
//March 28, 2016
//Homework 9
//Create rectangles and stuff with words

//import scanner
import java.util.Scanner;

public class Rectangularize{
    //main class
    
    public static void main(String[] args){
        //call scanner
        Scanner s = new Scanner(System.in);
        String word = "";
        //ask for word
            System.out.println("Please input a word");
            word= s.next();
            //count length of word
            int length = word.length();
            //go to int method using length
            print(length);
            //go to string method using word inputed
            print(word);
            
            
    }
    
    public static void print( int length){
        //use nested loops to print
        //first for row
        for(int i = 0; i<length; i++){
            System.out.println("");
            //nested for length of row
            for(int p = 0; p<length; p++){
                System.out.print("%");
            }
        }  
        System.out.println("");
        
        
        
    }
    
    public static void print( String word){
        //count chacarters in word
        int thing = word.length();
        //print out that many words
        for(int i=0; i<thing; i++){
           System.out.println(word); 
        }
        System.out.println("");
    }
    
    
    
}