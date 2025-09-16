import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter num1: ");
		int num1 = input.nextInt();
		System.out.print("Enter num2: ");
		int num2 = input.nextInt();
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.print("The swapped numbers are " + num1 + " and " + num2);
	}
}
