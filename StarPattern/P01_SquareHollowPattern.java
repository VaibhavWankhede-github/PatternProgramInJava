package StarPattern;


public class P01_SquareHollowPattern {

	// Java Program to print pattern
	// Square hollow pattern

	// Function to demonstrate pattern
	public static void printPattern(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 5;
		printPattern(n);
	}
}
