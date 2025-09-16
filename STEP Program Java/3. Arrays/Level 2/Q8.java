import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[][] marks = new int[numStudents][3];
        double[] percentage = new double[numStudents];
        String[] grade = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            do {
                System.out.print("Enter Physics marks (out of 100): ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks! Enter between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);
            do {
                System.out.print("Enter Chemistry marks (out of 100): ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks! Enter between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);
            do {
                System.out.print("Enter Maths marks (out of 100): ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks! Enter between 0 and 100.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (totalMarks / 300.0) * 100;
            if (percentage[i] >= 80) {
                grade[i] = "A (Level 4, above agency-normalized standards)";
            } else if (percentage[i] >= 70) {
                grade[i] = "B (Level 3, at agency-normalized standards)";
            } else if (percentage[i] >= 60) {
                grade[i] = "C (Level 2, below, but approaching agency-normalized standards)";
            } else if (percentage[i] >= 50) {
                grade[i] = "D (Level 1, well below agency-normalized standards)";
            } else if (percentage[i] >= 40) {
                grade[i] = "E (Level 1-, too below agency-normalized standards)";
            } else {
                grade[i] = "R (Remedial standards)";
            }
        }
		
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-7d | %-7d | %-8d | %-5d | %-9.2f%% | %s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }
    }
}