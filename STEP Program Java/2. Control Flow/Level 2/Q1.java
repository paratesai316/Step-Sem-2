import java.util.Scanner;
public class Q1 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number: ");
		int num = input.nextInt();
		
		for (int i = 1 ; i <= num ; i++) {
			String result;
			if (i%2 == 0) {
				result = "even";
				System.out.print(i + " is " + result + "\n");
			}
			else {
				result = "odd";
				System.out.print(i + " is " + result + "\n");
			}
		}
	}
}