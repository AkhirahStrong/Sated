
/*Chimp - Will eat anything, but in order to be sated they need at 
 * least 1000 calories and at least 200 calories of meat*/

public class Chimp implements Animal {
	
	FoodType foodType2 = FoodType.MEAT;
	FoodType foodType3 = FoodType.PLANTS;
	private int caloryCounter = 0;
	private int meat = 0;
	
	@Override
	public void eat(FoodType food, int calories) {
			if(food.equals(foodType3) || food.equals(foodType2)) {
			System.out.println(food);
			this.caloryCounter = calories;
		}
	}

	@Override
	public boolean isSated() {
		if(caloryCounter >= 1000 && meat >= 200 ) {
			return true;
		}
		return false;
	}

	public int getCaloryCounter() {
		return caloryCounter;
	}

	public void setCaloryCounter(int caloryCounter) {
		this.caloryCounter = caloryCounter;
	}

	public int getMeat() {
		return meat;
	}

	public void setMeat(int meat) {
		this.meat = meat;
	}
	
	

}
