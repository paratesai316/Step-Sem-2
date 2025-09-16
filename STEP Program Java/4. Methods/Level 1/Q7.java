import java.util.Scanner;

public class Q7 {
    public static int sumnumbers(int num) {
        int sum = 0;
        for (int i=1 ; i<=num ; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to get its sum: ");
        int num = sc.nextInt();
        
        int result = sumnumbers(num);
        System.out.println("Sum: " + result);

        sc.close();
    }
}