//Jake Sabatini
//February 13, 2016
//Homework 03 Convert
//convert from meters to inches

    import java.util.Scanner;
    
    public class Convert{
        public static void main(String[] args){
            
    Scanner Scanner1 = new Scanner( System.in);
    //ask for meters
    System.out.print("Enter number of meteres as xx: ");
    
    //accept user input
    double nummeters = Scanner1.nextDouble ();
    
    nummeters = 39.3701 *nummeters;
    //limit to 4 decimal places
    nummeters = nummeters * 10000;
    int intnummeters = (int) nummeters;
    double metersnum = (double) intnummeters;
    metersnum = metersnum/ 10000;
    
    System.out.println("Number of inches from your meters " +metersnum);
    
    //ask for second number
    System.out.print("Enter second number as meters xx : ");
    
    //accept user input
    double nummeters2 = Scanner1.nextDouble ();
    
    nummeters2 = nummeters2 * 39.37;
    
    //convert to 4 decimals
    nummeters2 = nummeters2 * 10000;
    int intnummeters2 = (int) nummeters2;
    double metersnum2 = (double) intnummeters2;
    metersnum2 = metersnum2/10000;
    
    //print out as inches
    System.out.println("Number of inches from your meters " +metersnum2);
    
            
            }
    }