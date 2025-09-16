import java.util.Scanner;
public class Q1 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] ages = new int[10];
		
		System.out.print("\nEnter the ages below: ");
		for (int i=0 ; i<10 ; i++) {
			System.out.print("\nAge " + i + ": ");
			ages[i] = input.nextInt();
		}
		
		for (int i=0 ; i<10 ; i++) {
			if (ages[i] < 18) {
				System.out.print("\nAge: " + ages[i] + " is not eligible to vote.");
			}
			else {
				System.out.print("\nAge: " + ages[i] + " is eligible to vote.");
			}
		}
	}
}