import java.util.Scanner;
public class Q7 {
    static String userInput;
    static void generateException() {
        System.out.println("Substring: " + userInput.substring(5, 2));
    }
    static void handleException() {
        try {
            System.out.println("Substring: " + userInput.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException!");
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
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main method:");
            System.out.println(e);
        }
        System.out.println("\nDemonstrating exception with handling inside method:");
        handleException();
        sc.close();
    }
}