import java.util.Scanner;

public class MeanStandardDeviation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("How many values will you enter? ");
		num = input.nextInt(); // 4
		
		double[] numbers = new double[num];
		
		// prompts user to enter numbers and stores numbers in the numbers array
		for (int i = 0; i < num; i++) {
			System.out.print("Enter number # " + i + ": ");
			numbers[i] = input.nextDouble();
		}
		
		double sum = 0;
		
		// adds the numbers in the numbers array together
		for (int j = 0; j < numbers.length; j++) {
			sum += numbers[j];
		}
		
		double mean = sum / numbers.length;
		
		double[] differences = new double[num];
		
		// calculates each number minus the mean
		for (int k = 0; k < numbers.length; k++) {
			differences[k] = numbers[k] - mean;
		}
		
		double[] differencesSquared = new double[num];
		
		// squares each result from the previous for loop
		for (int l = 0; l < numbers.length; l++) {
			differencesSquared[l] = Math.pow(differences[l], 2);
		}
		
		double sumDifference = 0;
		
		// calculates the sum of the numerator
		for (int m = 0; m < numbers.length; m++) {
			sumDifference += differencesSquared[m];
		}
		
		// divides the numerator by the denominator
		double divide = sumDifference / (num - 1);
		
		// square roots the result to find the standard deviation
		double standardDeviation = Math.sqrt(divide);
		
		System.out.println("The mean is: " + mean);
		System.out.println("The standard deviation is: " + standardDeviation);
	}
}
