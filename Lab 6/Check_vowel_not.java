import java.util.Scanner;

class Check_vowel_not{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Any String : ");
        String input = scanner.nextLine();

        int vCount = 0;
        int cCount = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vCount++;
                } else {
                    cCount++;
                }
            }
        }

        System.out.println("Number of vowels is : " + vCount);
        System.out.println("Number of consonants is : " + cCount);
    }
}
