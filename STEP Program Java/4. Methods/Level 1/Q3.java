import java.util.Scanner;

public class Q3 {
    public static int getMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = getMaxHandshakes(numberOfStudents);
        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);
    }
}
