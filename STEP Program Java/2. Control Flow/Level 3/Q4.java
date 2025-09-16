import java.util.Scanner;
public class Q4 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number to check if its prime: ");
		int num = input.nextInt();
		int counter=0;
		
		for (int i=2 ; i<=((num/2)+1) ; i++) {
			if (num%i==0) {
				counter++;
			}
		}
		if (counter>0) {
			System.out.print(num + " is not a prime number.");
		}
		else {
			System.out.print(num + " is a prime number.");
		}
	}
}