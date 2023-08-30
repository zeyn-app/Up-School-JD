package rentACar;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Vehicle {
	private final String id;
	private int year;
	private String brand;
	private VehicleType vehicleType;
	private BigDecimal pricePerDay;
	private boolean isAvailable = true;
	private Customer customer;
	private BigDecimal totalPrice = BigDecimal.ZERO;
	private int countOfRentDay;
	


	
	public Vehicle(int year, String brand, VehicleType vehicleType, BigDecimal pricePerDay) {
		super();
		this.id = UUID.randomUUID().toString();
		this.year = year;
		this.brand = brand;
		this.vehicleType = vehicleType;
		this.pricePerDay = pricePerDay;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public VehicleType getType() {
		return vehicleType;
	}
	public void setType(VehicleType type) {
		this.vehicleType = type;
	}
	public BigDecimal getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(BigDecimal pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public boolean isAvaliable() {
		return isAvailable;
	}
	public void setAvaliable(boolean isAvaliable) {
		this.isAvailable = isAvaliable;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getCountOfRentDay() {
		return countOfRentDay;
	}
	public void setCountOfRentDay(int countOfRentDay) {
		this.countOfRentDay = countOfRentDay;
	}
	public String getId() {
		return id;
	}
	
	
	public void rent(Customer customer, int countOfRentDay) {
		this.countOfRentDay = countOfRentDay;
		if(!isAvailable) {
			System.out.println("Müsait değil");
			return;
		}
		
		if(customer.getLicenceYear()< vehicleType.getMinLicenceYear()) {
			System.out.println(vehicleType.getErrorMessage());
			return;
		}
	}
	
	//var priceForRent = pricePerDay.multiply(pricePerDay);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
