import java.util.Scanner;
public class Triangleperimeter {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("\n\nEnter the perimeter: ");
		double perimeter = input.nextDouble();
		double side = perimeter/4;
		System.out.print("\n\nSide of the square is: " + side);
	}
}