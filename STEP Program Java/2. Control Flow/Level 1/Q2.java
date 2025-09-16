import java.util.Scanner;
public class Q2 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter 3 numbers num1, num2, num3: ");
		System.out.print("\nNum1: ");
		int num1 = input.nextInt();
		System.out.print("\nNum2: ");
		int num2 = input.nextInt();
		System.out.print("\nNum3: ");
		int num3 = input.nextInt();
		String result;
		
		if ((num1 < num2) && (num1 < num3)) {
			result = "Yes";
		}
		else {
			result = "No";
		}
		
		System.out.print("\nIs the first number the smallest? " + result);
	}
}