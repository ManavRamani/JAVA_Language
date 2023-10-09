import java.util.*;

class grad {
	public static void main(String[] args) {
		Scanner done = new Scanner(System.in);
\
				Scanner scanner = new Scanner(System.in);
				
				for (int i = 1; i <= 5; i++) {
					System.out.print("Enter marks for subject " + i + ": ");
					int marks = scanner.nextInt();
					
					switch (marks) {
						case -1:
							System.out.println("Negative mark encountered. Stopping execution.");
							return;
						default:
							if (marks < 0) {
								System.out.println("Negative mark encountered. Stopping execution.");
								return;
							}
					}
				}
				
				System.out.println("All marks are non-negative.");
			}

	// int total = s1 + s2 + s3 + s4 + s5;
	// int per = total / 5;
	// System.out.println("Total Marks : " + total);
	// System.out.println("Per : " + per + "%");
	// switch ((int) per / 10) {
	// case 10:
	// case 9:
	// System.out.print("First Division");
	// break;
	// case 8:
	// case 7:
	// System.out.print("Second Division");
	// break;
	// case 6:
	// case 5:
	// System.out.print("Third Division");
	// break;
	// default:
	// System.out.print("Fail");
	// }

	// }

	public static int getNonNegativeInput(Scanner scanner) {
		System.out.print("Enter a number: ");
		int input = scanner.nextInt();
		return (input < 0) ? getNonNegativeInput(scanner) : input;
	}
}