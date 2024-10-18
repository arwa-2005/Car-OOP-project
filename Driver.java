package o;

public class Driver {

	public static void main(String[] args) {
		CarRental [] arr=new CarRental[4];
		arr[0]=new CarRental();
		arr[1]=new CarRental();
		arr[2]=new LuxuryCarRental("M", 3, "KIA", true);
		arr[3]=new TruckCarRental("S", 4, "BMW", false);
		
		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}



	}

}
