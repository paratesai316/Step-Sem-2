import java.util.Scanner;
public class Q8 {

    static String userInput;
    static void generateException() {
        int number = Integer.parseInt(userInput);
        System.out.println("Parsed number: " + number);
    }

    static void handleException() {
        try {
            int number = Integer.parseInt(userInput);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        userInput = sc.nextLine();

        System.out.println("\nDemonstrating exception without handling:");
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main method:");
            System.out.println(e);
        }

        System.out.println("\nDemonstrating exception with handling inside method:");
        handleException();

        sc.close();
    }
}