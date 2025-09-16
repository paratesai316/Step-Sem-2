import java.util.Scanner;
public class Q8 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num=input.nextInt();
		int original=num;
		int sum=0;
		
		while (num!=0) {
			int digit = num%10;
			sum+=digit;
			num/=10;
		}
		if (original%sum==0) {
			System.out.print(original + " is a Harshad number.");
		}
		else {
			System.out.print(original + " is not a Harshad number.");
		}
	}
}