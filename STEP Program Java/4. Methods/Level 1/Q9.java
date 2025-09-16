import java.util.Scanner;

public class Q9 {
    public static int findquotient(int number, int divisor) {
        int quotient;
        quotient = number/divisor;
        return quotient;
    }
    public static int findremainder(int number, int divisor) {
        int remainder;
        remainder = number%divisor;
        return remainder;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        int qt = findquotient(number, divisor);
        int rm = findremainder(number, divisor);
        System.out.println("\nQuotient: " + qt);
        System.out.println("\nRemainder: " + rm);

        sc.close();
    }
}