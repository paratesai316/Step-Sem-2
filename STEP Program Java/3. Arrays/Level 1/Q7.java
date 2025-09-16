import java.util.Scanner;
public class Q7 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		if (num <= 0) {
			System.out.print("\nError");
		}
		else {
			int size = (num/2) + 1;
			int[] even = new int[size];
			int[] odd = new int[size];
			
			int evenindex=0;
			int oddindex=0;
			
			for (int i=1 ; i<=num ; i++) {
				if (i%2==0) {
					even[evenindex++] = i;
				}
				else {
					odd[oddindex++] = i;
				}
			}
			System.out.print("\nEven numbers: ");
			for (int i=0 ; i < evenindex ; i++) {
				System.out.print(even[i] + " ");
			}
		
			System.out.print("\nOdd numbers: ");
			for (int i=0 ; i<oddindex ; i++) {
				System.out.print(odd[i] + " ");
			}
		}
	}
}