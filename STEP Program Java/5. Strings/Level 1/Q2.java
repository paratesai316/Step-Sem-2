import java.util.Scanner;
public class Q2 {
    public static String charAtSubstring(String str1, int start, int end) {
        String strsub ="";
        for (int i=start ; i<=end ; i++) {
            strsub += str1.charAt(i);
        }
        return strsub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the string: ");
        String str1 = sc.nextLine();
        System.out.print("\nEnter the start index: ");
        int start = sc.nextInt();
        System.out.print("\nEnter the end index: ");
        int end = sc.nextInt();

        String substr1 = str1.substring(start, end);
        System.out.print("\nSubstring format: " + substr1);

        String substr2 = charAtSubstring(str1, start, end);
        System.out.print("\ncharAt format: " + substr2);
        sc.close();
    }
}