import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	static int nbInstances = 0;
	private ArrayList<Vehicle> vehicles;
	
	public Garage() {
		vehicles = new ArrayList<Vehicle>();
		nbInstances ++;
	}
	
	public void add(Vehicle c) {
		Objects.requireNonNull(c, "car must not be null");
		vehicles.add(c);
	}
	
	public int getId() {
		return nbInstances;
	}
	
	public int getValeur() {
		int somme = 0;
		for(Vehicle c: vehicles) {
			somme += c.getValue();
		}
		return somme;
	}
	
	public Vehicle firstCarByBrand(String brand) throws Exception {
		Objects.requireNonNull(brand, "brand must not be null");
		
		for(Vehicle car : vehicles) {
			if(car.getBrand().equals(brand)) {
				return car;
			}
		}
		throw new Exception("not found");
	}
	
	public void remove(Vehicle c) {
		vehicles.remove(c);
	}
	
	public void protectionism(String brand) {
		Objects.requireNonNull(brand, "brand must not be null");
		
		ArrayList<Vehicle> toRemove = new ArrayList<Vehicle>();
		
		for(Vehicle car : vehicles) {
			if(car.getBrand().equals(brand)) {
				toRemove.add(car);
			}
		}
		
		for(Vehicle v : toRemove) {
			this.remove(v);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Garage " + this.getId() + " = ");
		for(Vehicle c: vehicles) {
			sb.append(c.toString()+ " ");
		}
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) { 
            return true; 
        }
  
        if (!(obj instanceof Garage)) {
            return false; 
        } 
          
        Garage g = (Garage) obj; 
          
        return g.vehicles.equals(this.vehicles); 
	}

}
