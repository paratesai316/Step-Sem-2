import java.util.Scanner;
public class Q4 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        System.out.println("Enter the numbers:");

        while (true) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0) {
                break;
            }
            if (index < 10) {
                numbers[index] = num;
                index++;
            } 
			else {
                break;
            }
        }

        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
		
        System.out.println("\nTotal: " + total);
    }
}