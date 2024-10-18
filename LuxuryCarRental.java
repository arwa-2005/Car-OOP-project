package o;

public class LuxuryCarRental extends CarRental {
	private boolean addDriver;

	public LuxuryCarRental(String size, int days,String name,boolean addDriver) {
		super();
		this.addDriver = addDriver;
	}

	public double computeTotal(int days) {
		if (addDriver)
			return super.computeTotal(days)+50;
		return super.computeTotal(days);


	}


}
