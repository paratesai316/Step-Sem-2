import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();
        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Invalid");
                }
            } while (personData[i][0] <= 0);
            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Invalid");
                }
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Status");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-6d | %-10.2f | %-11.2f | %-5.2f | %s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }
    }
}