import java.util.Scanner;
public class Q3 {
    public static char[] charAtArray(String str1) {
        int len = str1.length();
        char[] char1 = new char[len];

        for (int i=0 ; i<len ; i++) {
            char1[i] = str1.charAt(i);
        }
        return char1;
    }

    public static char[] charToCharArray(String str1) {
        char[] char2 = str1.toCharArray();
        return char2;
    }

    public static boolean compare(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i=0 ; i<arr1.length ; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] builtInArray = charToCharArray(input);
        char[] customArray = charAtArray(input);

        boolean areEqual = compare(builtInArray, customArray);

        System.out.print("\ncharAt method: \n");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        System.out.print("\ntoCharArray method: \n");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }

        System.out.print("\nAre chars equal: " + areEqual);
        sc.close();
    }
}