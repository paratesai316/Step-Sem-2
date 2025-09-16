import java.util.Scanner;

public class Q6 {
    public static int checknum(int num) {
        if (num > 0) {
            return 1;
        }
        else if (num < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check positive/negative/zero: ");
        int num = sc.nextInt();
        
        int result = checknum(num);
        System.out.println("Result: " + result);
    }
}                           
