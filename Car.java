import java.util.Objects;

public class Car implements Vehicle{
	private final String brand;
	private final long value;
	private final int niveau;
	private final Discount discount;
	
	/**
	 * Constructeur 1
	 * @param brand
	 * @param value
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public Car(String brand, long value) throws NullPointerException, IllegalArgumentException {
		Objects.requireNonNull(brand, "brand must not be null");
		Objects.requireNonNull(value, "value must not be null");
		
		if(value<0) {
			throw new IllegalArgumentException("value >= 0");
		}
		else {
			this.brand = brand;
			this.value = value;
			this.niveau = 0;
			this.discount = null;
		}
	}
	
	/**
	 * Constructeur 2 (avec vestute)
	 * @param brand
	 * @param value
	 * @param vestute
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public Car(String brand, long value, int vestute) throws NullPointerException, IllegalArgumentException {
		Objects.requireNonNull(brand, "brand must not be null");
		Objects.requireNonNull(value, "value must not be null");
		Objects.requireNonNull(vestute, "value must not be null");
		
		if(value<0 || vestute<0) {
			throw new IllegalArgumentException("value or vestute >= 0");
		}
		else {
			long calcul_value = value;
			
			for(int i=0; i<vestute; i++) {
				if(calcul_value - 1000 < 0) {
					calcul_value = 0;
					break;
				}
				else
				{
					calcul_value -= 1000;
				}
			}
			
			this.brand = brand;
			this.value = calcul_value;
			this.niveau = vestute;
			this.discount = null;
		}
	}
	
	/**
	 * Constructeur 3 (avec discount)
	 * @param brand
	 * @param value
	 * @throws NullPointerException
	 * @throws IllegalArgumentException
	 */
	public Car(String brand, long value, Discount discount) throws NullPointerException, IllegalArgumentException {
		Objects.requireNonNull(brand, "brand must not be null");
		Objects.requireNonNull(value, "value must not be null");
		
		if(value<0) {
			throw new IllegalArgumentException("value >= 0");
		}
		else {
			this.brand = brand;
			this.value = discount.getValue();
			this.niveau = 0;
			this.discount = discount;
		}
	}
	
	/**
	 * Retourne la marque
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * Retourne la valeur
	 * @return
	 */
	public long getValue() {
		return value;
	}
	
	/**
	 * Retourne le niveau de vestute
	 * @return
	 */
	public int getNiveau() {
		return niveau;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Car@" + brand + " / value=" + value + "]"; 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		/*
		if (obj == this) { 
            return true; 
        }*/
  
        if (!(obj instanceof Car)) {
            return false; 
        } 
          
        Car c = (Car) obj; 
          
        return (c.getBrand().equals(this.brand) && c.getValue() == this.value && c.getNiveau() == this.niveau) && (obj == this); 
	}
	
	@Override
	public int hashCode() {
	    int result = 1;
	    result = 31 * result + (int) (value ^ (value >>> 32));
	    result = 31 * result + (niveau ^ (niveau >>> 32));
	    result = 31 * result + brand.hashCode();
	    return result;
	}
}
