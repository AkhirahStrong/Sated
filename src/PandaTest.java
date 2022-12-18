import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PandaTest {

	@Test
	void testPanda() {
		Panda p = new Panda();
		p.eat(FoodType.PLANTS, 3000);
		assertNotEquals(true, p.isSated());
		
	}

}
