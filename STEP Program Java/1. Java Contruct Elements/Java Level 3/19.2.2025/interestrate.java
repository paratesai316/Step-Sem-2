import java.util.Scanner;
public class interestrate {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the principal amount: ");
		double principal = input.nextDouble();
		System.out.print("\nEnter the interest percent: ");
		double interest = input.nextDouble();
		System.out.print("\nEnter the time in years: ");
		int time = input.nextInt();
		
		double simpleinterest = (principal * interest * time) / 100;
		
		System.out.print("\nThe Simple Interest is " + simpleinterest + " for Principal ");
		System.out.print(principal + ", and Rate of Interest " + interest + " and Time " + time + " year");
	}
}