import java.util.Scanner;
public class multiplicationtable {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		int[] table = new int[4];
		
		for (int i=0 ; i<=3 ; i++) {
			table[i] = (i+6)*num;
		}
		
		System.out.print("\nMultiplication table: \n");
		for (int i=0 ; i<=3 ; i++) {
			System.out.print(num + " * " + (i+6) + " = " + table[i] + "\n");
		}
	}
}