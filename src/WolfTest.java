import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WolfTest {

	@Test
	void testWolf() {
		Wolf wolf = new Wolf();
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		wolf.eat(FoodType.MEAT, 200);
		assertEquals(true, wolf.isSated());
	}

}
