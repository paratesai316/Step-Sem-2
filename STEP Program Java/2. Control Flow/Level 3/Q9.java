import java.util.Scanner;
public class Q9 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num=input.nextInt();
		int sum=0;
		
		for(int i=1;i<num;i++) {
			if (num%i==0) {
				sum+=i;
			}
		}
		if (sum>num) {
			System.out.print("\n" + num + " is an Abundant number.");
		}
		else {
			System.out.print("\n" + num + " is not an Abundant number.");
		}
	}
}