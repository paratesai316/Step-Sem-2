import java.util.Scanner;
public class Triangle {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("\n\nEnter the dimensions of the base: ");
		double base = input.nextDouble();
		System.out.print("\nEnter the dimensions of the height: ");
		double height = input.nextDouble();
		
		double baseinch = base/2.54;
		double heightinch = height/2.54;
		
		double basefeet = baseinch/12;
		double heightfeet = heightinch/12;
		
		double area = 0.5 * base * height;
		double areainch = 0.5 * baseinch * heightinch;
		double areafeet = 0.5 * basefeet * heightfeet;
		
		System.out.print("\n\nArea of the triangle:");
		System.out.print("\nIn centimeter = " + area);
		System.out.print("\nIn inches = " + areainch);
		System.out.print("\nIn feet = " + areafeet);
	}
}