import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int marks;
        char grade;

        System.out.print("Enter student name: ");
        name = scanner.nextLine();

        System.out.print("Enter marks: ");
        marks = scanner.nextInt();

        if (marks >= 90) {
            grade = 'A';
        }
        else if (marks >= 75) {
            grade = 'B';
        }
        else if (marks >= 60) {
            grade = 'C';
        }
        else if (marks >= 50) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("\nStudent Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}