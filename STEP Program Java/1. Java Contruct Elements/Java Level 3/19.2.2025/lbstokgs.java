import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the weight in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds / 2.2;
		
		System.out.print("\nThe weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
	}
}