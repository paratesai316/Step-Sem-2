import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter 3 numbers num1, num2, num3: ");
		System.out.print("\nNum1: ");
		int num1 = input.nextInt();
		System.out.print("\nNum2: ");
		int num2 = input.nextInt();
		System.out.print("\nNum3: ");
		int num3 = input.nextInt();
		String first;
		String second;
		String third;
		
		if ((num1 > num2) && (num1 > num3)) {
			first = "Yes";
			second = "No";
			third = "No";
		}
		else if ((num2 > num1) && (num2 > num3)) {
			first = "No";
			second = "Yes";
			third = "No";
		}
		else {
			first = "No";
			second = "No";
			third = "Yes";
		}
		
		System.out.print("\nIs the first number the largest? " + first);
		System.out.print("\nIs the second number the largest? " + second);
		System.out.print("\nIs the third number the largest? " + third);
	}
}