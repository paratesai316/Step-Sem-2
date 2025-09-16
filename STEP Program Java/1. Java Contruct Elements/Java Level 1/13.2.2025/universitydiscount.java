public class universitydiscount {
	public static void main(String[] args) {
		double fees;
		System.out.print("\n\nEnter the University Fees: ");
		fees = input.nextDouble();
		double discountpercent;
		System.out.print("\nEnter the Discount Percent: ");
		discountpercent = input.nextDouble();
		
		double newfees = fees - (fees*discountpercent/100);
		
		System.out.print("\nThe discount amount is INR " + fees*discountpercent/100 + "and final discounted fee is INR " + newfees);
	}
}