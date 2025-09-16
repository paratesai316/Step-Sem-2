import java.util.Scanner;

public class TravelInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter fromCity: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter viaCity: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter fromToVia: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter viaToFinalCity: ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter timeTaken: ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        System.out.print("Enter fee: ");
        int fee = scanner.nextInt();
        System.out.print("Enter discountPercentage: ");
        int discountPercent = scanner.nextInt();
        
        int discountAmount = (fee * discountPercent) / 100;
        int finalFee = fee - discountAmount;
        
        System.out.println("\nTravel Details:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("\nThe results of Int Operations are " + fee + ", " + discountAmount + ", and " + finalFee);
        
        scanner.close();
    }
}