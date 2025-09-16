import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number whose table you want: ");
		int num = input.nextInt();
		
		int[] table = new int[11];
		for (int i=1 ; i<=10 ; i++) {
			table[i] = i*num;
		}
		
		System.out.print("\nTable of " + num + ": \n");
		for (int i=1 ; i<=10 ; i++) {
			System.out.print(num + " * " + i + " = " + table[i] + "\n");
		}
	}
}