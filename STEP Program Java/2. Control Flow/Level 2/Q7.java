import java.util.Scanner;
public class Q7 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number ");
		int num = input.nextInt();
		System.out.print("\nFactors of " + num + "\n");
		
		for (int i=1 ; i<=num ; i++) {
			if (num%i == 0) {
				System.out.print(i + "\n");
			}
		}
	}
}