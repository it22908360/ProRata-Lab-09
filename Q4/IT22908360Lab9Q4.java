import java.util.Scanner;

public class IT22908360Lab9Q4 {

    // Calculate final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {

        double finalMark;

        finalMark = (assignmentMark * 0.30) + (examMark * 0.70);

        return finalMark;
    }

    // Find grade
    public static char findGrades(double finalMark) {

        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // Print student details
    public static void printDetails(String name, double finalMark, char grade) {

        System.out.printf("%-10s %-12.2f %s%n",
                name, finalMark, grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        double assignmentMark;
        double examMark;

        // Input details of 5 students
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            examMark = input.nextDouble();

            // Calculate final mark
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);

            // Find grade
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        // Display results
        System.out.printf("%-10s %-12s %s%n",
                "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {

            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}