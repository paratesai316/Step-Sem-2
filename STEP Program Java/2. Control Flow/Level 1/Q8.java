import java.util.Scanner;
public class Q8 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number for countdown: ");
		int num = input.nextInt();
		
		while (num >= 1) {
			System.out.print("\n" + num);
			num = num-1;
		}
	}
}