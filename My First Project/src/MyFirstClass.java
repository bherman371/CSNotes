import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Please enter an even number (not 0): ");
       int num = input.nextInt();
       
       if (num == 0) {
    	   System.out.println("Please enter a valid number.");
    	   System.exit(0);
       } else {
    	   if (num % 2 == 0) {
        	   System.out.println("The number you entered is: " + num);
           } else {
        	   System.out.println("Please enter a valid number.");
        	   System.exit(0);
           }
       }
    }

}