import java.util.Scanner;
class NumberChecker {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, n);
        }
        return sum == number;
    }

    public static void findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest != Integer.MIN_VALUE ? secondLargest : "None"));
    }

    public static void findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + (secondSmallest != Integer.MAX_VALUE ? secondSmallest : "None"));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to analyze: ");
        int number = input.nextInt();

        System.out.println("\nAnalyzing number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        System.out.println("Is duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(number, digits));

        findTwoLargest(digits);
        findTwoSmallest(digits);
        
        input.close();
    }
}