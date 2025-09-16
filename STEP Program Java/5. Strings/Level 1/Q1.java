import java.util.Scanner;
class Q1 {
    public static void stringcheck(String str1, String str2) {
        int result=0;
        for (int i=0 ; i<str1.length() ; i++) {
            
            if (str1.charAt(i) == str2.charAt(i)) {
                result++;
            }
            else {
                result = 0;
            }
            
        }
        if (result == str1.length()) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        stringcheck(str1, str2);
        sc.close();
    }
}