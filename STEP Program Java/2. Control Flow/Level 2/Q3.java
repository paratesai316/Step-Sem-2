import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		
		for (int i = 6 ; i <= 9; i++) {
			System.out.print(num + " * " + i + " = " + num*i + "\n");
		}
	}
}