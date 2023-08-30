package rentACar;

import java.util.UUID;

public class Customer {
	// long olunca otomatik arttırırz
	private final String id; //UUID, setter'ı engellemek için final kullandık
	private String name;
	private String surname;
	private int licenceYear;
	
	
	//public Customer() {}
	
	
	public Customer(String name, String surname, int licenceYear) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.surname = surname;
		this.licenceYear = licenceYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getLicenceYear() {
		return licenceYear;
	}
	public void setLicenceYear(int licenceYear) {
		this.licenceYear = licenceYear;
	}
	public String getId() {
		return id;
	}
	
	// toString()'i ezdik burada!
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", licenceYear=" + licenceYear + "]";
	}
	
}
