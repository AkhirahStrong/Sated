import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChimpTest {

	@Test
	void testChimp() {
		Chimp chimp = new Chimp();
		chimp.eat(FoodType.MEAT, 1000);
		assertEquals(true, chimp.isSated());
	}

}
