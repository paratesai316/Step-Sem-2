import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the sides 1, 2 and 3 in km: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		double distance1round = side1 + side2 + side3;
		double numberrounds = 5 / distance1round;
		
		System.out.print("The total number of rounds the athlete will run is: " + numberrounds + " to complete 5k.");
	}
}