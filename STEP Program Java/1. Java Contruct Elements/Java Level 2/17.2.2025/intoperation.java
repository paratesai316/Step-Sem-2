import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();
        
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", result1, result2, result3, result4);
    }
}