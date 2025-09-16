import java.util.Scanner;
public class Q1 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number to check divisibility by 5: ");
		int num1 = input.nextInt();
		String result;
		
		
		if ((num1 % 5) == 0) {
			result = "Yes";
		}
		else {
			result = "No";
		}
		
		System.out.print("\nIs the number " + num1 + " divisible by 5? " + result);
	}
}