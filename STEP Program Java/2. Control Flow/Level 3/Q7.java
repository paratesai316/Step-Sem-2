import java.util.Scanner;
public class Q7 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter your weight: ");
		double weight=input.nextDouble();
		System.out.print("\nEnter your height: ");
		double height=input.nextDouble();
		double heightm = height/100;
		
		double bmi = weight/(heightm*heightm);
		//System.out.print(bmi);
		
		if (bmi<=18.4) {
			System.out.print("\nStatus: Underweight");
		}
		else if (bmi>=18.5 && bmi<=24.9) {
			System.out.print("\nStatus: Normal");
		}
		else if (bmi>=25.0 && bmi<=39.9) {
			System.out.print("\nStatus: Overweight");
		}
		else {
			System.out.print("\nStatus: Obese");
		}
	}
}