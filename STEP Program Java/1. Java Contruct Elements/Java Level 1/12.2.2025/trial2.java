import java.util.Scanner;
public class ContactDetails {
	public static void main(String[] args) {
		String name, email, phone;
		int age;
		double height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Enter your email: ");
		System.out.print("Enter your phone number: ");
		email = input.nextLine();
		phone = input.nextLine();
		System.out.print("Enter your age: ");
		age = input.nextInt();
		System.out.print("Enter your height: ");
		height = input.nextDouble();
		
		System.out.print("\n\nContact details: ");
		System.out.print("\nName: " + name + "\nEmail: " + email + "\tPhone: " + phone + "\nAge : " + age + "\tHeight: " + height);
		input.close();
	}
}