import java.util.Scanner;
public class Q2 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter year to check if its leap year: ");
		int year = input.nextInt();
		
		if (year <= 1582) {
			System.out.print("Leap year program not yet established");
		}
		else if ((year%4==0) && !(year%100==0) || (year%400==0)) {
			System.out.print(year + " is a leap year.");
		}
		else {
			System.out.print(year + " is not a leap year");
		}
	}
}