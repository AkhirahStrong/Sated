import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigTest {

	@Test
	void testPig() {
		Pig p = new Pig();
		p.eat(FoodType.MEAT, 1000);
		p.eat(FoodType.PLANTS, 1000);
		p.eat(FoodType.LIGHT, 1000);
		assertEquals(true, p.isSated());
	}
	
	@Test
	void testPig2() {
		Pig p = new Pig();
		p.eat(FoodType.MEAT, 100);
		assertEquals(false, p.isSated());
	}

}
