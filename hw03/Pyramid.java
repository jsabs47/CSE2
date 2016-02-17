//Jake Sabatini
//February 12, 2016
//Homework 03 Pyramid
//Given specific deminsions find the volume of a pyramid

    import java.util.Scanner;
    
    public class Pyramid{
        public static void main(String[] args){
            
    Scanner Scanner1 = new Scanner( System.in);
    
    
    //ask for length
    System.out.print("Enter the length of the pyramid as xx: ");
    
    //accept input
    double lengthval = Scanner1.nextDouble ();
    
    //ask for height
    System.out.print("Enter the height of the pyramid as xx: ");
    
    //accept input
    double heightval = Scanner1.nextDouble ();
    
    
    //find volume of pyramid
    
    double volume = (lengthval * lengthval * heightval)/3;
    
    //outprint volume
    System.out.println("The volume of the pyramid is: " +volume);
            
        }
    }