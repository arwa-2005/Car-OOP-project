package o;

public class TruckCarRental extends CarRental {
	private boolean isPickUp;

	public TruckCarRental(String size, int days,String name,boolean isPickUp) {
		super();
		this.isPickUp = isPickUp;
	}

	@Override
	public double computeTotal(int days) {
		if (isPickUp)
			return super.computeTotal(days)+20;
		return super.computeTotal(days);
	}

	@Override
	public String toString() {
		return "TruckCarRental [isPickUp=" + isPickUp + ", getName()=" + getName() + ", getSize()=" + getSize()
				+ ", getDailyFree()=" + getDailyFee() + ", getDays()=" + getDays() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	

}
