import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int maxDigit = 10;
        int[] ages = new int[maxDigit];
        float[] heights = new float[maxDigit];
        int index = 0;

        for (int i = 0; i < names.length; i++) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempAges = new int[maxDigit];
                float[] tempHeights = new float[maxDigit];
                for (int j = 0; j < index; j++) {
                    tempAges[j] = ages[j];
                    tempHeights[j] = heights[j];
                }
                ages = tempAges;
                heights = tempHeights;
            }
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[index] = sc.nextInt();
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[index] = sc.nextFloat();
            index++;
        }

        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        float maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < names.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        System.out.println("\nThe youngest friend is " + youngest + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");
    }
}
