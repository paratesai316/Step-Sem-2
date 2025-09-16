import java.util.Scanner;
public class Q5 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter a number: ");
		int num = input.nextInt();
		
		if (num > 0) {
			int i=1;
			while (i<= num) {
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
				i++;
			}
		}
		else {
			System.out.print("\nNumber is negative");
		}
	}
}