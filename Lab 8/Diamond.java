import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner done = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = done.nextInt();
        
        printDiamond(n);
    }

    static void printDiamond(int n) {
        int i, j;
        
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j < i + 1; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
        
        for (i = n-2; i >= 0; i--) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (j = 0; j < i + 1; j++) {
                System.out.print(" *  ");
            }
            System.out.println();
        }
    }
}