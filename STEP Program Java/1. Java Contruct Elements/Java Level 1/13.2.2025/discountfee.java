public class DiscountFee {
	public static void main(String[] args){
		double fee = 125000;
		double discountPercent = 10;
		double discountfees = fee * discountPercent/100;
		double newfees = fee - discountfees;
		System.out.print("The discount amount is INR" + discountfees + "and the final discounted fees is INR" + newfees);
	}
}