public class Q5 {
    static void generateException() {
        String text = null;
        System.out.println("Length of the text: " + text.length());
    }
    static void handleException() {
        String text = null;
        try {
            System.out.println("Length of the text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Demonstrating exception without handling:");
        
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main method:");
            System.out.println(e);
        }
        
        System.out.println("\nDemonstrating exception with handling inside method:");
        
        handleException();
    }
}