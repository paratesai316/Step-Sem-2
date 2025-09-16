import java.util.Scanner;
public class Q5 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter your age to check voting eligibility: ");
		int age = input.nextInt();
		
		if (age >= 18) {
			System.out.print("\nVoter is eligible to vote. ");
		}
		else {
			System.out.print("\nVoter is not eligible to vote. ");
		}
	}
}
