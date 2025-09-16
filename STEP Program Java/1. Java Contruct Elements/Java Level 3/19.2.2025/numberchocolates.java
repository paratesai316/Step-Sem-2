import java.util.Scanner;
public class numberOfChocolates {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter the number of chocolates to be divided: ");
		int numberOfChocolates = input.nextInt();
		System.out.print("\nEnter the number of children: ");
		int numberOfChildren = input.nextInt();
		
		int chocolatesperchild = numberOfChocolates / numberOfChildren;
		int remainder = numberOfChocolates % numberOfChildren;
		
		System.out.print("\nThe number of chocolates each child gets is " + chocolatesperchild);
		System.out.print(" and the number of remaining chocolates are " + remainder);
	}
}