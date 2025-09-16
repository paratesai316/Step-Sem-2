import java.util.Scanner;

public class Q10 {
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

        System.out.print("Enter the number of chocolates: ");
        int numberChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberChildren = sc.nextInt();

        int qt = findquotient(numberChocolates, numberChildren);
        int rm = findremainder(numberChocolates, numberChildren);
        System.out.println("\nNumber of Chocolates each child gets: " + qt);
        System.out.println("Remainder of Chocolates: " + rm);

        sc.close();
    }
}