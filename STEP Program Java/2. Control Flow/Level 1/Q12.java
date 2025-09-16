import java.util.Scanner;
public class Q12 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number to get the sum of numbers: ");
		int num = input.nextInt();
		int sum = 0;
		
		int formulasum = (num * (num + 1))/2;		
		
		while (num>=0) {
			sum += num;
			num--;
		}
		
		if (sum == formulasum) {
			System.out.print("\nWhile loop sum = " + sum);
			System.out.print("\nFormula sum = " + formulasum);
			System.out.print("\nWhile loop executed successfully");
		}
		else {
			System.out.print("\nError in while loop");
		}
	}
}