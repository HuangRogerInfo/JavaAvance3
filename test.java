import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
	
	@Test
	void testEgalite() {
		
		Car car1 = new Car("volvo", 10000);
		Car car2 = new Car("volvo", 10000);
		Car carCopie2 = car2;
		
		assertEquals(car1, car2);
		assertTrue(car2 == carCopie2);
	}
	
	@Test
	void testException() {
		assertThrows(NullPointerException.class, () -> {
			Car car3 = new Car(null,1000);
		});
		
		assertThrows(IllegalArgumentException.class, () -> {
			Car car4 = new Car("volvo",-1000);
		});
		
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
			Car car5 = new Car("volvo",1000,-1000);
		});
		
		assertTrue(thrown.getMessage().contains("value or vestute >= 0"));
	}
	
	@Test
	void testNull() {
		// Pas d'utilité mais juste pour tester assertNull
		Car car6 = null;
		assertNull(car6);
	}

}
