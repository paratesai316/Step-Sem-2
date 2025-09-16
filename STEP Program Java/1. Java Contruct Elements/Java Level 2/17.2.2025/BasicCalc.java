import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("\n\nEnter Num1: ");
		int num1 = input.nextInt();
		System.out.print("\nEnter Num2: ");
		int num2 = input.nextInt();
		int sum = num1 + num2;
		int diff = num1 - num2;
		int product = num1 * num2;
		double divide = num1 / num2;
		
		System.out.print("Basic Arithmetic results of: \nNum1: " + num1 + "\nNum2: " + num2);
		System.out.print("\n\nSum = " + sum);
		System.out.print("\nDifference = " + diff);
		System.out.print("\nProduct = " + product);
		System.out.print("\nDivision = " + divide);
	}
}