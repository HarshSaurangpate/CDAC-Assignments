import java.util.Scanner;

public class AlphabetCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] count = new int[26];

        // Count alphabets
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Convert uppercase to lowercase
            ch = Character.toLowerCase(ch);

            // Check if character is an alphabet
            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

        // Display characters that occurred
        for (int i = 0; i < 26; i++) {

            if (count[i] > 0) {
                System.out.println((char)('A' + i) + " : " + count[i]);
            }
        }
    }
}