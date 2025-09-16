import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
        } else {
            System.out.println("No valid digits found.");
        }
        if (secondLargest != -1) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
    }
}
