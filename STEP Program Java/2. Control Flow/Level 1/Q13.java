import java.util.Scanner;
public class Q13 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number to get the sum of numbers: ");
		int num = input.nextInt();
		int sum = 0;
		
		int formulasum = (num * (num + 1))/2;		
		
		for (int i = 0 ; i <= num ; i++) {
			sum += i;
		}
		
		if (sum == formulasum) {
			System.out.print("\nFor loop sum = " + sum);
			System.out.print("\nFormula sum = " + formulasum);
			System.out.print("\nFor loop executed successfully");
		}
		else {
			System.out.print("\nFor loop sum = " + sum);
			System.out.print("\nFormula sum = " + formulasum);
			System.out.print("\nError in for loop");
		}
	}
}