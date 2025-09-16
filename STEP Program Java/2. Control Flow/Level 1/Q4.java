import java.util.Scanner;
public class Q4 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the natural number for sum of numbers: ");
		int num = input.nextInt();
		int sum;
		
		if (num > 0) {
			sum = (num * (num + 1))/2;
			System.out.print("\nThe sum of " + num + " natural numbers is " + sum);
		}
		else {
			System.out.print("The number " + num + " is not a natural number");
		}
	}
}