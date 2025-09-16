import java.util.Scanner;
public class Q5 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		int original = num;
		int sum = 0;
		
		while (num!=0) {
			int digit  = num % 10;
			sum = sum + (digit*digit*digit);
			num = num/10;
		}
		System.out.print("\n");
		if (original == sum) {
			System.out.print(sum + " is an Armstrong number.");
		}
		else {
			System.out.print(sum + " is not an Armstrong number.");
		}
	}
}