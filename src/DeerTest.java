import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeerTest {

	@Test
	void testDeer() {
		Deer d = new Deer();
		d.eat(FoodType.PLANTS, 1200);
		assertEquals(true, d.isSated());
	}

}
