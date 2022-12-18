import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BushTest {

	@Test
	void testBush() {
		Bush b = new Bush();
		b.eat(FoodType.LIGHT, 50);
		assertEquals(true, b.isSated());
	}

}
