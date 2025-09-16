import java.util.Scanner;
public class Q1 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[] years = new int[10];
		double[] salary = new double[10];
		double[] bonus = new double[10];
		double[] total = new double[10];
		
		for (int i=0 ; i<10 ; i++) {
			System.out.print("Enter number of years and salary of employee: " + i + ": ");
			years[i] = input.nextInt();
			salary[i] = input.nextDouble();
			
			if (years[i] >= 5) {
				bonus[i] = 0.05 * salary[i];
				total[i] = bonus[i] + salary[i];
			}
			else {
				bonus[i] = 0.02 * salary[i];
				total[i] = bonus[i] + salary[i];
			}
		}
		System.out.print("\nUpdated salaries: \n");
		for (int i=0 ; i<10 ; i++) {
			System.out.print("Employee: " + i);
			System.out.print("\tInitial salary: " + salary[i]);
			System.out.print("\tBonus: " + bonus[i]);
			System.out.print("\tTotal salary: " + total[i]);
			System.out.print("\n");
		}
	}
}