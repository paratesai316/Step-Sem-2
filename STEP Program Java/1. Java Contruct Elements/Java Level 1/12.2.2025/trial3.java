import java.util.Scanner;
public class DisplayResults {
	public static void main(String[] args) {
		String name;
		int rollno;
		double physics_marks, chemistry_marks, biology_marks;
		double science_marks;
		
		System.out.print("Enter student's name: ");
		name = input.nextLine();
		System.out.print("Enter " + name + "'s Roll number");
		rollno = input.nextInt();
		System.out.print("Enter physics marks: ");
		physics_marks = input.nextDouble();
		System.out.print("Enter chemistry marks: ");
		chemistry_marks = input.nextDouble();
		System.out.print("Enter biology marks: ");
		biology_marks = input.nextDouble();
		
		science_marks = (physics_marks + chemistry_marks + biology_marks)/3;
		System.out.print("\n\n" + name + "; Roll Number: " + rollno + "\nPhysics Marks: " + physics_marks + "\nChemistry Marks: " + chemistry_marks + "\nBiology Marks: " + biology_marks + "\n\nScience Marks: " + science_marks);
		input.close();
	}
}