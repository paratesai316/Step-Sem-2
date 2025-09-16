import java.util.Scanner;
public class Tempconversion {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\n\nEnter the temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheitResult = (celsius * 9 / 5) + 32;
		
		System.out.print("\n" + celsius + "C in Fahrenheit is: " + fahrenheitResult + "F");
	}
}