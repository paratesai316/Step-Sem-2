import java.util.Scanner;

public class Q8 {
    public static int smallest(int n1, int n2, int n3) {
        int small;
        if (n1<n2 && n1<n3) {
            small = n1;
        }
        else if (n2<n1 && n2<n3) {
            small = n2;
        }
        else {
            small = n3;
        }
        return small;
    }
    public static int largest(int n1, int n2, int n3) {
        int large;
        if (n1>n2 && n1>n3) {
            large = n1;
        }
        else if (n2>n1 && n2>n3) {
            large = n2;
        }
        else {
            large = n3;
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter num 3: ");
        int n3 = sc.nextInt();
        
        int smallestnum = smallest(n1, n2, n3);
        int largestnum = largest(n1, n2, n3);
        System.out.println("\nSmallest: " + smallestnum);
        System.out.println("\nLargest: " + largestnum);

        sc.close();
    }
}