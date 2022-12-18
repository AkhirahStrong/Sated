

/*Bush - "Eats" only light and needs only 50 calories a day 
 * (Yes, we know a bush is not actually an animal. Use your 
 * imagination.)*/

public class Bush implements Animal{
	
	private int caloryCounter = 0;
	FoodType foodType = FoodType.LIGHT;

	@Override
	public void eat(FoodType food, int calories) {
		
		if(food.equals(foodType)) {
			System.out.println(food);
			this.caloryCounter = calories;
		}
		
	}

	@Override
	public boolean isSated() {
		if(this.caloryCounter >= 50) {
			return true;
		}
		
		
		return false;
	}
	
	

}
