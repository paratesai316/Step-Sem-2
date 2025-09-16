import java.util.Scanner;
public class Q2 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		double salary;
		int years;
		
		System.out.print("\nEnter the salary of the employee: ");
		salary = input.nextDouble();
		System.out.print("\nEnter the number of years worked by the employee: ");
		years = input.nextInt();
		
		if (years > 5) {
			salary *= 1.05;
			System.out.print("\nEmployee eligible for bonus.");
		}
		else {
			System.out.print("\nNo salary bonus for employee");
		}
		
		System.out.print("\nEmployee salary: " + salary);
	}
}