import java.util.Scanner;

class Student {
    String name;
    String rollNumber;
    int totalMarks;

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNumber = sc.nextLine();

        System.out.print("Enter total marks: ");
        student.totalMarks = sc.nextInt();

        student.display();
    }
}