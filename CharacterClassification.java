import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
            } 
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            else {
                other++;
            }
        }

        System.out.println("Uppercase letters: " + uppercase);
        System.out.println("Lowercase letters: " + lowercase);
        System.out.println("Digits: " + digits);
        System.out.println("Other characters: " + other);
    }
}