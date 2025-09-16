import java.util.Scanner;
public class Q2 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] num = new int[5];
		
		System.out.print("\nEnter the numbers below: ");
		for (int i=0 ; i<5 ; i++) {
			System.out.print("\nIndex" + i + ": ");
			num[i] = input.nextInt();
		}
		
		for (int i=0 ; i<5 ; i++) {
			if (num[i] < 0) {
				System.out.print("\nNumber: " + num[i] + " is negative.");
			}
			if (num[i] > 0) {
				System.out.print("\nNumber: " + num[i] + " is positive.");
			}
			if (num[i] == 0) {
				System.out.print("\nNumber: " + num[i] + " is zero.");
			}
		}
		
		System.out.print("\n");
		for (int i=0 ; i<5 ; i++) {
			if (num[i] % 2 == 0) {
				System.out.print("\nNumber: " + num[i] + " is even.");
			}
			else {
				System.out.print("\nNumber: " + num[i] + " is odd.");
			}
		}
	}
}