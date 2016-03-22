//Jake Sabatini
//March 18, 2016
//Homework 7 Twisty
//Nested Loops

    import java.util.Scanner;

    public class Twisty{
        public static void main(String[] args){
        
        boolean goodInput = true;
        Scanner s = new Scanner(System.in);
        int length = 0;
        
        while(goodInput){
            System.out.println("Enter Length greater than 0 and less than 80");
            while(!s.hasNextInt()){
                System.out.println("Please enter an valid interger");
                s.next();
            }
            length = s.nextInt();
            if(length <= 79 && length >0){
                goodInput = false;
            }
        }
        
        boolean secondInput = true;
        int width = 0;
        
        while(secondInput){
            System.out.println("Enter Width greater than 0 and less than length");
            while(!s.hasNextInt()){
                System.out.println("Please enter an valid interger");
                s.next();
            }
            width = s.nextInt();
            if(width <= length && width >0){
                secondInput = false;
            }
        }
        
       
        
    
        for(int line_number =1; line_number<= width; line_number++){
            int charactersremaining = length;
            int patternlength;
            while(charactersremaining>0){
                if(charactersremaining>2*width){
                    patternlength = 2*width;
                }
                else{
                    patternlength = charactersremaining;
                }
            for(int index= 0; index<patternlength; index++){       
                if(index == line_number -1){
                    System.out.print("#");
                }
                else if(index == width - line_number){
                    System.out.print("/");
                }
                else if(index == width+line_number - 1){
                    System.out.print("\\");
                }
                else if(index == 2*width-line_number){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
    
            }
            charactersremaining -= patternlength;
            
            }
            System.out.println("");
        }

    
    
    
    
    }
    }
    

