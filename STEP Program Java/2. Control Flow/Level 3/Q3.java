import java.util.Scanner;
public class Q3 {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("\nEnter physics, chemistry and maths marks: ");
		System.out.print("\nChemistry: ");
		int physics = input.nextInt();
		System.out.print("\nChemistry: ");
		int chemistry = input.nextInt();
		System.out.print("\nMaths: ");
		int maths = input.nextInt();
		double average = (physics + chemistry + maths)/3;
		
		if (average>=80) {
			System.out.print("\nGrade: A.\nRemarks: Level 4, above agency-normalized students");
		}
		else if(average>=70 && average<=79) {
			System.out.print("\nGrade: B.\nRemarks: Level 3, at agency-normalized standards.");
		}
		else if(average>=60 && average<=69) {
			System.out.print("\nGrade: C.\nRemarks: Level 2, below, but approaching agency-normalized standards.");
		}
		else if(average>=50 && average<=59) {
			System.out.print("\nGrade: D.\nRemarks: Level 1, well below agency-normalized standards.");
		}
		else if(average>=40 && average<=49) {
			System.out.print("\nGrade: E.\nRemarks: Level 1-, too below agency-normalized standards.");
		}
		else {
			System.out.print("\nGrade: R.\nRemarks: Remedial standards.");
		}
	}
}