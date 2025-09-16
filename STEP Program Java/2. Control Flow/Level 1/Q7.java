import java.util.Scanner;
public class Q7 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter month and date: ");
		System.out.print("\nMonth: ");
		int month = input.nextInt();
		System.out.print("\nDate: ");
		int date = input.nextInt();
		String spring = "Its Spring Seasong";
		String notspring = "Not Spring Season";
		
		if (month==3 && date>=20 && month>=31) {
			System.out.print(spring);
		}
		else if (month==4 && date>=1 && date<=30) {
			System.out.print(spring);
		}
		else if (month==5 && date>=1 && date<=30) {
			System.out.print(spring);
		}
		else if (month==6 && date>=1 && date<=20) {
			System.out.print(spring);
		}
		else {
			System.out.print(notspring);
		}
	}
}