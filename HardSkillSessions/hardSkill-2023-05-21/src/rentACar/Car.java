package rentACar;

import java.math.BigDecimal;

public class Car extends Vehicle{
	private boolean hasChildSeat;
	private Customer secondCustomer; // customer dan driver iherite edilebilir.
	
	

	public Car(String id, int year, String brand, VehicleType type, BigDecimal pricePerDay, boolean hasChildSeat) {
		super(id, year, brand, type, pricePerDay);
		this.hasChildSeat = hasChildSeat;
	}



	public boolean isHasChildSeat() {
		return hasChildSeat;
	}



	public void setHasChildSeat(boolean hasChildSeat) {
		this.hasChildSeat = hasChildSeat;
	}



	public Customer getSecondCustomer() {
		return secondCustomer;
	}



	public void setSecondCustomer(Customer secondCustomer) {
		this.secondCustomer = secondCustomer;
	}
	
	

}
