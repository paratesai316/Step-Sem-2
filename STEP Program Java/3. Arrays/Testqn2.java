import java.util.Scanner;
public class employeebonus {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] years = new int[3];
		double[] salary = new double[3];
		double[] bonus = new double[3];
		double[] total = new double[3];
		
		System.out.print("\nEnter employees years of work and salary: ");
		for (int i=0 ; i<3 ; i++) {
			System.out.print("\nEmployee " + i + ": ");
			years[i] = input.nextInt();
			salary[i] = input.nextDouble();
			
			if (years[i] >= 5) {
				bonus[i] = 0.05 * salary[i];
				total[i] = salary[i] + bonus[i];
			}
			else {
				bonus[i] = 0.02 * salary[i];
				total[i] = salary[i] + bonus[i];
			}
		}
		
		System.out.print("\nEmployee salary info: \n");
		for (int i=0 ; i<3 ; i++) {
			System.out.print("\nEmployee " + i + " info: ");
			System.out.print("\tYears: " + years[i]);
			System.out.print("\tInitial Salary: " + salary[i]);
			System.out.print("\tBonus: " + bonus[i]);
			System.out.print("\tNew Salary: " + total[i]);
		}
	}
}