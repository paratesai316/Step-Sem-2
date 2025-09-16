import java.util.Scanner;
public class Q12 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number to get the sum of numbers: ");
		int num = input.nextInt();
		int factorial = 1;
		
		while (num>0) {
			factorial *= num;
			num--;
		}
	
		System.out.print("\nWhile loop factorial = " + factorial);
	}
}