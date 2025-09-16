import java.util.Scanner;
public class Q1{
	public static void simpleinterest (double p, double r, double t) {
		System.out.print("The simple interest is: " + (p*r*t)/100);
	}
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the principal: ");
		double p = sc.nextDouble();
		System.out.print("\nEnter the rate: ");
		double r = sc.nextDouble();
		System.out.print("\nEnter the time: ");
		double t = sc.nextDouble();
		
		simpleinterest(p,r,t);
	}
}