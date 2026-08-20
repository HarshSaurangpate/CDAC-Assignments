import java.util.Arrays;
import java.util.Scanner;

public class SortStudentNames {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (maximum 10): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        // Read student names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // Sort names alphabetically
        Arrays.sort(names);

        // Display sorted names
        System.out.println("\nStudent names in alphabetical order:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}