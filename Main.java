import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Car car1 = new Car("volvo", 10000);
		System.out.println(car1);
		
		Car car2 = new Car("bmw", 15000);
		System.out.println(car2);
		
		Bike bike1 = new Bike("Scott");
		Bike bike2 = new Bike("bmw");
		Bike bike3 = new Bike("bmw");
		
		
		Garage g = new Garage();
		g.add(car1);
		g.add(car2);
		g.add(bike1);
		g.add(bike2);
		g.add(bike3);
		System.out.println(g);
		
		g.protectionism("bmw");
		System.out.println(g);
	
		try {
		System.out.println(g.firstCarByBrand("bmw"));}
		catch (Exception e){
			System.err.println("Caught Exception: " + e.getMessage());
		}
		
		System.out.println(g.getId());
		System.out.println(g.getValeur());
		
		/***** EXERCICE 2 ******/
		
		//QUESTION 1
		System.out.println("----------Exe 2 Question 1-------------");
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
		//QUESTION 2
		System.out.println("----------Exe 2 Question 2-------------");
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c));
		
		//QUESTION 3
		System.out.println("----------Exe 2 Question 3-------------");
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		
		
	}
}
