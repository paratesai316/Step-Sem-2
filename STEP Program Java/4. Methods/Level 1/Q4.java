import java.util.Scanner;

public class Q4 {
    public static int getnumlaps(int s1, int s2, int s3) {
        return (5000/(s1+s2+s3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dimension of the triangular park: ");
        System.out.print("Enter the length of side 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter the length of side 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter the length of side 3: ");
        int s3 = sc.nextInt();

        int numlaps = getnumlaps(s1, s2, s3);
        System.out.println("Number of laps: " + numlaps);
    }
}