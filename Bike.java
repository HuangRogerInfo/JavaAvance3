
public class Bike implements Vehicle {
	private final String brand;
	private final int valeur;
	private final Discount discount;
	
	public Bike(String brand) {
		this.brand = brand;
		valeur = 100;
		discount = null;
	}
	
	public Bike(String brand, Discount discount) {
		this.brand = brand;
		this.discount = discount;
		this.valeur = discount.getValue();
	}
	
	
	public String getBrand() {
		return this.brand;
	}
	
	public long getValue() {
		return this.valeur;
	}
	
	@Override
	public String toString() {
		return "[Bike@" + brand + "]";
	}
	
	

}
