import java.util.Scanner;

//********************************************
// Name: Benjamin Herman
// Course Name: CS120 - Computer Programming I
// Date: 9/24/19
// Semester: 1
// 
// Cipher.java
//
// Encodes 5 numbers using the Caesar code
// and prints out the result.
//********************************************
public class Cipher {

	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		
		int number1, number2, number3, number4, number5, key, sum, tensPlaceDigit, onesPlaceDigit, encodedTensPlace, encodedOnesPlace;
		
		// reads 5 integers between 0 and 19
		System.out.print("Enter an integer between 0 and 19: ");
		number1 = inputNumber.nextInt();
		
		System.out.print("Enter an integer between 0 and 19: ");
		number2 = inputNumber.nextInt();
		
		System.out.print("Enter an integer between 0 and 19: ");
		number3 = inputNumber.nextInt();
		
		System.out.print("Enter an integer between 0 and 19: ");
		number4 = inputNumber.nextInt();
		
		System.out.print("Enter an integer between 0 and 19: ");
		number5 = inputNumber.nextInt();
		
		System.out.println("");
		
		// reads a key to encode the numbers
		System.out.print("Enter a key (integer) between 0 and 9: ");
		key = inputNumber.nextInt();
		
		System.out.println("");
		
		sum = number1 + number2 + number3 + number4 + number5;
		
		// finds tens and ones place digits
		tensPlaceDigit = sum / 10;
		onesPlaceDigit = sum % 10;
		
		// encodes the tens and ones place digits
		encodedTensPlace = (tensPlaceDigit + key) % 10;
		encodedOnesPlace = (onesPlaceDigit + key) % 10;
		
		System.out.println("Your encoded number is: " + encodedTensPlace + encodedOnesPlace);
	}

}
