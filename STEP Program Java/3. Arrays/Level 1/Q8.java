import java.util.Scanner;
public class Q8 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number: ");
		int num = input.nextInt();
		int maxfactors=10;
		int[] factors = new int[maxfactors];
		int factind = 0;
		
		for (int i=1 ; i<num ; i++) {
			if (num%i == 0) {
				if (factind == maxfactors) {
					maxfactors *= 2;
					int [] temp = new int[maxfactors];
					for (int j=0 ; j<factind ; j++) {
						temp[j] = factors[j];
					}
					
					factors = temp;
				}
				factors[factind++] = i;
			}
		}
		
		System.out.print("\nFactors: ");
		for (int i=0 ; i<factind ; i++) {
			System.out.print(factors[i] + " ");
		}
	}
}