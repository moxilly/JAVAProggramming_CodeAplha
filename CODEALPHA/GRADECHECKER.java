import java.util.Scanner;

public class GRADECHECKER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();

            sum += grades[i];
            highest = Math.max(highest, grades[i]);
            lowest = Math.min(lowest, grades[i]);
        }

        double average = (double) sum / numStudents;

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        // You can add logic to compute letter grades based on average here
        // (e.g., if-else statements).

        scanner.close();
    }
}

