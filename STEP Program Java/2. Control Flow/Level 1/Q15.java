import java.util.Scanner;
public class Q13 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number to get the sum of numbers: ");
		int num = input.nextInt();
		int factorial = 1;		
		
		for (int i = 1 ; i <= num ; i++) {
			factorial *= i;
		}
		
		System.out.print("\nFor loop factorial = " + factorial);
	}
}