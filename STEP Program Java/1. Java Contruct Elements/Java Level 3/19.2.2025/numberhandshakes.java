import java.util.Scanner;
public class numberStudents {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number of students: ");
		int numberstudents = input.nextInt();
		
		int numberhandshakes = (numberstudents * (numberstudents - 1)) / 2;
		
		System.out.print("\nThe number of possible handshakes is " + numberhandshakes);
	}
}