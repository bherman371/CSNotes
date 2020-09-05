import java.util.*;

public class Test {
	
	Scanner input = new Scanner(System.in);
	Random generator = new Random();

	public void message() {
		System.out.println("Hello World!");
		
		System.out.print("What is your age? ");
		int age = input.nextInt();
		
		System.out.println("Your age is: " + age);
	}
	
	public void message2(int num) {
		System.out.println("The number is: " + num);
	}
	
	public void message3(String message1, String message2) {
		int num1 = generator.nextInt(11);
		int num2 = generator.nextInt(11);
		
		System.out.println(num1 + ", " + num2);
		
		if (num1 > num2) {
			System.out.println(message1);
		} else if (num2 > num1) {
			System.out.println(message2);
		} else {
			System.out.println("num1 = num2");
		}
	}
	
	public void switchStatement() {
		int x;
		
		System.out.print("Enter a number from 1 to 3: ");
		x = input.nextInt();
		
		if (x < 1 || x > 3) {
			System.out.println("Please enter a valid number from 1 to 3.");
			System.exit(0);
		}
		
		switch (x) {
			case 1:
				System.out.println("You entered the number 1.");
				break;
			case 2:
				System.out.println("You entered the number 2.");
				break;
			case 3:
				System.out.println("You entered the number 3.");
				break;
		}
	}
	
	public void whileLoop(int count) {
		while (count != 10) {
			count++;
		}
		System.out.println("Result: " + count);
	}
	
	public void doWhileLoop(int count) {
		do {
			count++;
			System.out.println(count);
		} while (count < 5);
	}
	
	public void forLoop() {
		for (int count = 0; count < 5; count++) {
			System.out.println(count);
		}
	}
}
