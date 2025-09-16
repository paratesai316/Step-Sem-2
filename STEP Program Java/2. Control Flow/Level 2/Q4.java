import java.util.Scanner;
public class Q4 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		
		if (num > 0) {
			for (int i = 1 ; i <= num ; i++) {
				if ((i%3==0) && (i%5==0)) {
					System.out.print("FizzBuzz\n");
				}
				else if (i%5 == 0) {
					System.out.print("Buzz\n");
				}
				else if(i%3==0) {
					System.out.print("Fizz\n");
				}
				else {
					System.out.print(i + "\n");
				}
			}
		}
		else {
			System.out.print("\nNumber is negative");
		}
	}
}