//Jake Sabatini
//March 8, 2016
//TextSpinner
//create a tex spinnner that cycle through figures

public class TextSpinner{
    public static void main(String[] args){
        boolean accept = true;
        
        while(accept == true){
            System.out.print("/");
            System.out.print("\b");
            System.out.print("-");
            System.out.print("\b");
            System.out.print("\\");
            System.out.print("\b");
            System.out.print("|");
            System.out.print("\b");
        }
    }
}