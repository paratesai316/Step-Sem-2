import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
		
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
		
        System.out.println("\nThe youngest friend is " + youngest + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");

    }
}
