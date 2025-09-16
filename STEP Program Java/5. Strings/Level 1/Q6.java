import java.util.Scanner;
public class Q6 {
    static String userInput;
    static void generateException() {
        System.out.println("Character at index 10: " + userInput.charAt(10));
    }
    static void handleException() {
        try {
            System.out.println("Character at index 10: " + userInput.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException!");
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method:");
            System.out.println(e);
        }

        System.out.println("\nDemonstrating exception with handling inside method:");
        handleException();
        
        sc.close();
    }
}
