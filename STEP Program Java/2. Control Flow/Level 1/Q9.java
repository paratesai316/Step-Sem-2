import java.util.Scanner;
public class Q9 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number for countdown: ");
		int num = input.nextInt();
		
		for (int i = num ; i >= 1 ; i--) {
			System.out.print(num + "\n");
			num = num - 1;
		}
	}
}