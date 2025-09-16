import java.util.Scanner;
public class Q6 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		double[] height = new double[11];
		double sum=0;
		
		System.out.print("\nEnter the heights of the players: ");
		for (int i=0 ; i<11 ; i++) {
			height[i] = input.nextDouble();
			sum += height[i];
		}
		double average = sum/11;
		
		System.out.print("\nAverage height: " + average);
	}
}