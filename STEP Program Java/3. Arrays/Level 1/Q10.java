import java.util.Scanner;
public class Q10 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		
		String[] arr = new String[num+1];
		int index = 0;
		
		for (int i=0 ; i<=num ; i++) {
			if ((i%3==0) && (i%5==0)) {
				arr[i] = "FizzBuzz";
			}
			else if ((i%3==0) && !(i%5==0)) {
				arr[i] = "Fizz";
			}
			else if (!(i%3==0) && (i%5==0)) {
				arr[i] = "Buzz";
			}
			else {
				arr[i] = String.valueOf(i);
			}
		}
		
		for (int i=0 ; i<=num ; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
}