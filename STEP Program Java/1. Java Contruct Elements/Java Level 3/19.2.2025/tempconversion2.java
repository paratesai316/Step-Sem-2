import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsiusResult = (fahrenheit - 32) * 5 / 9;
		
		System.out.print("\n" + fahrenheit + "F in Celsius is: " + celsiusResult + "C");
	}
}
