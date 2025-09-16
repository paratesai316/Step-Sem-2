import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
                
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
		double distanceInCm = distanceInFeet*30.48;
		double distanceInInches = distanceInFeet/12;
        
        System.out.printf("\nHeight in cm is " + distanceInCm);
		System.out.printf("\nHeight in feet is " + distanceInFeet);
		System.out.printf("\nHeight in yards is " + distanceInYards);
		System.out.printf("\nHeight in cm is " + distanceInInches);

    }
}