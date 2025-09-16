import java.util.Scanner;
public class BasicCalc {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the users salary: ");
		double salary = input.nextDouble();
		System.out.print("\nEnter the users bonus: ");
		double bonus = input.nextDouble();
		
		double total = salary + bonus;
		
		System.out.print("\nThe salary is INR: " + salary + " and the bonus is INR: " + bonus);
		System.out.print("\nHence the total income is INR: " + total);
	}
}
