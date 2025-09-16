import java.util.Scanner;
public class Q9 {
    static String convertToUpper(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result += ch;
        }

        return result;
    }
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String userInput = sc.nextLine();

        String builtInUpper = userInput.toUpperCase();

        String manualUpper = convertToUpper(userInput);

        System.out.println("\nBuilt-in toUpperCase() result: " + builtInUpper);
        System.out.println("Manual conversion result    : " + manualUpper);

        boolean areEqual = compareStrings(builtInUpper, manualUpper);

        System.out.println("\nAre both converted strings equal? " + areEqual);

        sc.close();
    }
}