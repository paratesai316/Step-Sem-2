import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        int temp = number;

        while (temp != 0) {
            digits[index++] = temp % 10; 
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("\nFrequency of Digits");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i]);
            }
        }
    }
}