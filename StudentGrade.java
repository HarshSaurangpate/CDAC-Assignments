import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        System.out.println("Enter marks for 5 subjects (out of 20):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        char grade;

        if (total >= 90) {
            grade = 'E';
        } else if (total >= 80) {
            grade = 'A';
        } else if (total >= 70) {
            grade = 'B';
        } else if (total >= 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks = " + total);
        System.out.println("Grade = " + grade);
    }
}