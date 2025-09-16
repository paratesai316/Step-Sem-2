import java.util.Scanner;
public class Q5 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number: ");
		int num = input.nextInt();
		int[] table = new int[4];
		
		for (int i=0 ; i<=3 ; i++) {
			table[i] = (i+6)*num;
		}
		
		for (int i=0 ; i<=3 ; i++) {
			System.out.print(num + " * " + (i+6) + " = " + table[i] + "\n");
		}
	}
}