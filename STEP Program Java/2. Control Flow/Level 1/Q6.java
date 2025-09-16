import java.util.Scanner;
public class Q6 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number: ");
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.print("\nNumber is positive. ");
		}
		else if (num < 0) {
			System.out.print("\nNumber is negative. ");
		}
		else {
			System.out.print("\nNumber is zero. ");
		}
	}
}