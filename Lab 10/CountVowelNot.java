import java.util.Scanner;

class CountVowelNot {
    private int[] counts;

    public CountVowelNot() {
        counts = new int[5];
    }

    public void countVowels(String str) {
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                switch (ch) {
                    case 'a':
                        counts[0]++;
                        break;
                    case 'e':
                        counts[1]++;
                        break;
                    case 'i':
                        counts[2]++;
                        break;
                    case 'o':
                        counts[3]++;
                        break;
                    case 'u':
                        counts[4]++;
                        break;
                }
            }
        }
    }

    public void displayCounts() {
        System.out.println("Vowel Counts : ");
        System.out.println("A : " + counts[0]);
        System.out.println("E : " + counts[1]);
        System.out.println("I : " + counts[2]);
        System.out.println("O : " + counts[3]);
        System.out.println("U : " + counts[4]);
    }

    public static void main(String[] args) {
        Scanner done = new Scanner(System.in);
        CountVowelNot count = new CountVowelNot();

        // Advance Code addtional...........
        // System.out.print("Enter a String (or 'quit' -> exit) : ");
        // String str = done.nextLine();
        // count.countVowels(str);
        // count.displayCounts();

        while (true) {
            System.out.print("Enter a String (or 'quit' -> exit) : ");
            String str = done.nextLine();

            if (str.equals("quit")) {
                break;
            }
            count.countVowels(str);
        }
        count.displayCounts();
    }
}