import java.util.Scanner;
public class Q6 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		int counter=0;
		
		while (num!=0) {
			num /= 10;
			counter++;
		}
		System.out.print("Digits in the number is: " + counter);
	}
}