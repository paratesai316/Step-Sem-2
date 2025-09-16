import java.util.Scanner;
public class Q10 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter 2 numbers: ");
		double num1= input.nextDouble();
		double num2=input.nextDouble();
		System.out.print("\nEnter an operator: ");
		input.nextLine();
		String op = input.nextLine();
		
		switch (op) {
			case "+": {
				num1+=num2;
				System.out.print(num1);
				break;
			}
			case "-": {
				num1-=num2;
				System.out.print(num1);
				
				break;
			}
			case "*": {
				num1*=num2;
				System.out.print(num1);
				break;
			}
			case "/": {
				num1/=num2;
				System.out.print(num1);
				break;
			}
			default: {
				System.out.print("\nInvalid operator.");
				break;
			}
		}
	}
}