package StarPattern;


public class P02_NumberTrianglePattern {

	// Java Program to print pattern
	// Number triangle pattern

	// Function to demonstrate pattern
	public static void printPattern(int n) {
		
		// outer loop to handle number of rows
		for (int i = 1; i <= n; i++) {
			// inner loop to print space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// inner loop to print Value
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			// print new line for each row
			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[]) {
		int n = 5;
		printPattern(n);
	}
}
