
public class TwoDArrayProcessing {

	public static void main(String[] args) {
		double[][] twoDArray = { {1, 2, 3, 4, 5},
								 {6, 7, 8, 9, 10},
								 {11, 12, 13, 14, 15},
								 {16, 17, 18, 19, 20},
								 {21, 22, 23, 24, 25} };
		
		double result = matrixAverage(twoDArray);
		System.out.println(result);
	}
	
	public static double matrixAverage(double[][] matrix) {
		int sum = 0;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
		}
		
		return sum / (matrix.length * matrix[0].length);
	}
}
