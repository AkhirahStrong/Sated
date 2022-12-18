

/*Pig - Will eat anything and needs 3000 calories, 
 * it needs 1000 meat calories and 1000 plant calories 
 * to be sated*/

public class Pig implements Animal{
	
	FoodType foodType2 = FoodType.MEAT;
	FoodType foodType3 = FoodType.PLANTS;
	private int caloryCounter = 3000;
	private int meat = 0;
	private int plants = 0;
	
	
	@Override
	public void eat(FoodType food, int calories) {
			if(food.equals(foodType2) || food.equals(foodType3)) {
			//System.out.println(food);
			this.caloryCounter = calories;
			this.meat += caloryCounter;
			this.plants -= caloryCounter;
		}
	}

	@Override
	public boolean isSated() {
		if(caloryCounter <= 0 && this.meat>= 1000 && this.plants >= 1000 ) {
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

	public int getPlants() {
		return plants;
	}

	public void setPlants(int plants) {
		this.plants = plants;
	}

}
