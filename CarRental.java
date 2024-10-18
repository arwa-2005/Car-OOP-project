package o;

public class CarRental {
		private String name;
		private String size;
		private double dailyFee;
		private int days;
		public CarRental() {
			this("RANGE ROVER","O",2);
		}
		public CarRental(String name, String size, int days) {
			
			this.name = name;
			this.size = size;
			this.days = days;
		}
		public double computeTotal(int days) {
			return days*dailyFee;
		
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public double getDailyFee() {
			return dailyFee;
		}
		public void setDailyFee(double dailyFee) {
			if (size=="M")
				dailyFee=38.99;
			else if (size=="S")
				dailyFee=29.99;
			else if (size=="O")
				dailyFee=43.5;
		    
		}
		public int getDays() {
			return days;
		}
		public void setDays(int days) {
			this.days = days;
		}
		@Override
		public String toString() {
			return "CarRental [name=" + name + ", size=" + size + ", dailyFree=" + dailyFee + ", days=" + days + "]";
		}
		

}
