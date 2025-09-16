import java.util.Scanner;

public class Q11 {
    public static double calculateWindChill(double temp, double windV) {
        double windchill;
        windchill = 35.74 + (0.6215*temp) + ((0.4275*temp)-35.75) * Math.pow(windV, 0.16);
        return windchill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windV = sc.nextDouble();

        double windchill  = calculateWindChill(temp, windV);
        System.out.println("\nWind chill: " + windchill);

        sc.close();
    }
}