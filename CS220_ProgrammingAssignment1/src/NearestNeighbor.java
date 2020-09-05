import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
//****************************************************************
// Name: Benjamin Herman
// Date: 2/28/20
// Course Name: CS 220 - Computer Programming II
// Semester: 2
// Assignment Name: Machine Learning - NearestNeighbor.java
//****************************************************************
public class NearestNeighbor {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		double[][] trainData = new double[75][4];
		double[][] testData = new double[75][4];
		String[] trainLabel = new String[75];
		String[] testLabel = new String[75];
		
		// asks user to enter the names of the files
		System.out.print("Enter the name of the training file: ");
		String trainingFile = input.nextLine();
		
		System.out.print("Enter the name of the testing file: ");
		String testingFile = input.nextLine();
		
		System.out.println();
		
		// creates File objects for the two files entered by the user
		File fileTraining = new File(trainingFile);
		File fileTesting = new File(testingFile);
		
		Scanner scan = new Scanner(fileTraining);
		
		System.out.println("EX#: TRUE LABEL, PREDICTED LABEL");
		
		// fills up the trainData and trainLabel arrays
		Scanner sc = new Scanner(new BufferedReader(new FileReader(fileTraining)));
	    while (sc.hasNextLine()) {
	    	for (int i = 0; i < trainData.length; i++) {
	    		String[] lines = sc.nextLine().split(",");
	            for (int j = 0; j < lines.length - 1; j++) {
	               trainData[i][j] = Double.parseDouble(lines[j]);
	            }
	            trainLabel[i] = lines[4];
	    	}
	    }
	    
	    // fills up the testData and testLabel arrays
	    Scanner sc2 = new Scanner(new BufferedReader(new FileReader(fileTesting)));
	    while (sc2.hasNextLine()) {
	    	for (int i = 0; i < testData.length; i++) {
	    		String[] lines2 = sc2.nextLine().split(",");
	    		for (int j = 0; j < lines2.length - 1; j++) {
	    			testData[i][j] = Double.parseDouble(lines2[j]);
	    		}
	    		testLabel[i] = lines2[4];
	    	}
	    }
	    
	    String[] predictedTestLabel = new String[75];
	    
	    // fills up the predictedTestLabel array with the closest training values
	    for (int i = 0; i < 75; i++) {
	    	double minDistance = distance(testData, trainData, i, 0);
	    	int minPosition = 0;
	    	for (int j = 0; j < 75; j++) {
	    		double currentDistance = distance(testData, trainData, i, j);
	    		if (currentDistance < minDistance) {
	    			minDistance = currentDistance;
	    			minPosition = j;
	    		}
	    	}
	    	predictedTestLabel[i] = trainLabel[minPosition];
	    }
	    
	    // prints the training labels and predicted labels side by side
	    for (int i = 0; i < predictedTestLabel.length; i++) {
	    	System.out.println((i + 1) + ": " + trainLabel[i] + " " + predictedTestLabel[i]);
	    }
	    
	    double sum = 0;
	    for (int i = 0; i < 75; i++) {
	    	if (predictedTestLabel[i].equals(trainLabel[i])) {
	    		sum++;
	    	}
	    }
	    
	    double accuracy = sum / 75;
	    
	    System.out.println("ACCURACY: " + accuracy);
	    
	}
	
	// calculates distance between values in the testData and trainData arrays
	// in order to find which values are closest
	public static double distance(double[][] test, double[][] train, int a, int b) {
		// subtracts each train value from each test value
		double subtraction1 = test[a][0] - train[b][0];
		double subtraction2 = test[a][1] - train[b][1];
		double subtraction3 = test[a][2] - train[b][2];
		double subtraction4 = test[a][3] - train[b][3];
		
		double square1 = Math.pow(subtraction1, 2);
		double square2 = Math.pow(subtraction2, 2);
		double square3 = Math.pow(subtraction3, 2);
		double square4 = Math.pow(subtraction4, 2);
		
		double sum = square1 + square2 + square3 + square4;
		
		double squareRoot = Math.sqrt(sum);
		
		return squareRoot;
	}

}