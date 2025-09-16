import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            while (marks[i][0] < 0) {
                System.out.print("Invalid marks. Enter positive value for Physics: ");
                marks[i][0] = sc.nextInt();
            }
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            while (marks[i][1] < 0) {
                System.out.print("Invalid marks. Enter positive value for Chemistry: ");
                marks[i][1] = sc.nextInt();
            }
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
            while (marks[i][2] < 0) {
                System.out.print("Invalid marks. Enter positive value for Maths: ");
                marks[i][2] = sc.nextInt();
            }
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 3.0);
            if (percentages[i] >= 80) {
                grades[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentages[i] >= 70) {
                grades[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentages[i] >= 60) {
                grades[i] = "C (Level 2, below but approaching agency-normalized standards)";
            } else if (percentages[i] >= 50) {
                grades[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percentages[i] >= 40) {
                grades[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                grades[i] = "R (Remedial standards)";
            }
        }

        System.out.println("\nStudent Grades");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-10s%n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-10s%n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}