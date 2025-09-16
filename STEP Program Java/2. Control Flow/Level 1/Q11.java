import java.util.Scanner;
public class Q11 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nType the numbers you want to add: ");
		int sum = 0;
		int num;
		
		while (true) {
			num = input.nextInt();
			if (num > 0) {
				sum = sum + num;
			}
			else {
				break;
			}
		}
		System.out.print("The sum of the numbers is: " + sum);
	}
}