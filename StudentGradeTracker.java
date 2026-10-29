import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      STUDENT GRADE TRACKER");
        System.out.println("=================================");

        // Step 1: Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 2: Arrays to store student data
        String[] names = new String[n];
        double[] marks = new double[n];

        // Step 3: Input student details
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks (0-100): ");
            marks[i] = sc.nextDouble();
            sc.nextLine();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter marks between 0 and 100.");

                System.out.print("Enter marks again: ");
                marks[i] = sc.nextDouble();
                sc.nextLine();
            }
        }

        // Step 4: Calculate average, highest and lowest
        double total = 0;
        double highest = marks[0];
        double lowest = marks[0];

        for (int i = 0; i < n; i++) {

            total = total + marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        double average = total / n;

        // Step 5: Display student report
        System.out.println("\n========== STUDENT REPORT ==========");

        for (int i = 0; i < n; i++) {

            System.out.println(
                "Name: " + names[i] + " | Marks: " + marks[i]
            );
        }

        // Step 6: Display summary
        System.out.println("\n========== SUMMARY ==========");

        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}


