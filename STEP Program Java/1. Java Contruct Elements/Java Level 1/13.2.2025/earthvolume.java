public class earthVolume {
	public static void main(String[] args) {
		double radius = 6378;
		double pi = 3.1415;
		double milesconversion = 1.6;
		double volume;
		double mvolume;
		
		volume = (4/3) * pi * radius * radius * radius;
		
		double mradius;
		mradius = radius/milesconversion;
		
		mvolume = (4/3) * pi * mradius * mradius * mradius;
		
		System.out.print("\n\nThe volume of the earth in cubic kilometers is: ");
		System.out.print("\nVolume in cubic km: " + volume);
		System.out.print("\n\nThe volume of the earth in cubic miles is: ");
		System.out.print("\nVolume in cubic miles: " + mvolume);
		
	}
}