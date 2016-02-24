//Jake Sabatini
//February 19, 2016
//Homework 4
//Convert 3 numbers to hexadecimals

    import java.util.Scanner;

    public class ToHex {
        public static void main(String[] args){
        
        Scanner myScanner = new Scanner( System.in);
    
    
    //ask for three inputs
    System.out.print("Enter First number, Second Number, and Third Number ");
    if(!myScanner.hasNextInt()){
        System.out.println("Sorry your number has to be an interger");
        System.exit(1);
    }
    //accpet user inputs
    int first = myScanner.nextInt ();
    int second = myScanner.nextInt ();
    int third =  myScanner.nextInt ();
    
            //number needs to be below 255 so say that
            if ( 255<first || first<0 ){
            System.out.println("Sorry number needs to be below 256  and above 0");
            System.exit(1);
            }
            if ( 255<second || second<0 ){
            System.out.println("Sorry number needs to be below 256");
            System.exit(1);
            }
            if ( 255<third || third<0 ){
            System.out.println("Sorry number needs to be below 256");
            System.exit(1);
            }
            
            
            
            double first1;
            double first2;

    //convert to hexadecimal
    first1 = first/16;
    int intfirst1 = (int) first1;
    first2 = first%16;
    int intfirst2 = (int) first2;
    
     String num1 = "";
     String num11 = "";
    //make it possible for hexadecimals for first part
    switch(intfirst1){
        case 10:
            num1 = "A";
            break;
        case 11:
            num1 = "B";
            break;
        case 12:
            num1 = "C";
            break;
        case 13:
            num1 = "D";
            break;
        case 14:
            num1 = "E";
            break;
        case 15:
            num1 = "F";
            break;
    }
    //finding letters for second part of hexadecimal
    switch(intfirst2){
        case 10:
            num11 = "A";
            break;
        case 11:
            num11 = "B";
            break;
        case 12:
            num11 = "C";
            break;
        case 13:
            num11 = "D";
            break;
        case 14:
            num11 = "E";
            break;
        case 15:
            num11 = "F";
            break;
            
    }
    //print out correct  number or letter    
    if(256<first){
    }
    else{
    System.out.println(intfirst1<10 ? intfirst1 : num1);
    System.out.println(intfirst2<10 ? intfirst2 : num11);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //finding hexadecimal for 2nd number
    double second1;
    double second2;

    //convert to hexadecimal
    second1 = second/16;
    int intsecond1 = (int) second1;
    second2 = second%16;
    int intsecond2 = (int) second2;
    
     String num2 = "";
     String num22 = "";
    //make it possible for hexadecimals
    switch(intsecond1){
        case 10:
            num2 = "A";
            break;
        case 11:
            num2 = "B";
            break;
        case 12:
            num2 = "C";
            break;
        case 13:
            num2 = "D";
            break;
        case 14:
            num2 = "E";
            break;
        case 15:
            num2 = "F";
            break;
    }
      //finding letters for second part of hexadecimal
    switch(intsecond2){
        case 10:
            num22 = "A";
            break;
        case 11:
            num22 = "B";
            break;
        case 12:
            num22 = "C";
            break;
        case 13:
            num22 = "D";
            break;
        case 14:
            num22 = "E";
            break;
        case 15:
            num22 = "F";
            break;
            
    }
    
    //print out correct  number or letter
    if(256<second){
    }
    else{
    System.out.println(intsecond1<10 ? intsecond1 : num2);
    System.out.println(intsecond2<10 ? intsecond2 : num22);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//finding hexadecimal for 3rd number
    double third1;
    double third2;

    //convert to hexadecimal
    third1 = third/16;
    int intthird1 = (int) third1;
    third2 = third%16;
    int intthird2 = (int) third2;
    
     String num3 = "";
     String num33 = "";
    //make it possible for hexadecimals
    switch(intthird1){
        case 10:
            num3 = "A";
            break;
        case 11:
            num3 = "B";
            break;
        case 12:
            num3 = "C";
            break;
        case 13:
            num3 = "D";
            break;
        case 14:
            num3 = "E";
            break;
        case 15:
            num3 = "F";
            break;
    }
      //finding letters for second part of hexadecimal
    switch(intthird2){
        case 10:
            num33 = "A";
            break;
        case 11:
            num33 = "B";
            break;
        case 12:
            num33 = "C";
            break;
        case 13:
            num33 = "D";
            break;
        case 14:
            num33 = "E";
            break;
        case 15:
            num33 = "F";
            break;
            
    }
    
    //print out correct  number or letter
    if(256<third){
    }
    else{
    System.out.println(intthird1<10 ? intthird1 : num3);
    System.out.println(intthird2<10 ? intthird2 : num33);
    }
    
            
            
        }
    }