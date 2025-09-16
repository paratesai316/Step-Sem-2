import java.util.Scanner;
 public class Q6 {     
	public static void main(String[] args) {         
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the number of people:");
		int num = input.nextInt();
		double[] heights = new double[num];
		double[] weights = new double[num];
		double[] bmi = new double[num];
		String[] status = new String[num];
		
		for (int i=0 ; i<num ; i++) {
			System.out.print("Enter the height (cm) and weight of person " + (i+1) + "\n");
			heights[i] = input.nextDouble();
			weights[i] = input.nextDouble();
			double temp = heights[i]/100;
			bmi[i] = weights[i]/(temp*temp);
			if (bmi[i] <= 18.4) {
				status[i] = "Underweight";
			}
			else if (bmi[i] > 18.4 && bmi[i] <= 24.9) {
				status[i] = "Normal";
			}
			else if (bmi[i] > 24.9 && bmi[i] <= 39.9) {
				status[i] = "Overweight";
			}
			else {
				status[i] = "Obese";
			}
		}
		
		System.out.print("\nBMI of the above people: ");
		for (int i=0 ; i<num ; i++) {
			System.out.print("\nBMI of person " + (i+1));
			System.out.print("\nBMI: " + bmi[i] + "\tStatus: " + status[i]);
		}
	}
 