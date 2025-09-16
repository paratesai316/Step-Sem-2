import java.util.Scanner;
public class Q5 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println("Multiples of " + number + " below 100:");
		
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}