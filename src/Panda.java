
/*Panda - Eats only plants, their bodies are very inefficient 
 * so they only take in 50% of the calories they eat, they need 
 * 3000 calories per day*/

public class Panda implements Animal{
	
	FoodType foodType = FoodType.PLANTS;
	private int caloryCounter = 0;

	@Override
	public void eat(FoodType food, int calories) {
		if(food.equals(foodType)) {
			System.out.println(food);
			this.caloryCounter = calories;
		}else {
			System.out.println("Not an option");
		}
		
	}

	@Override
	public boolean isSated() {
		if(caloryCounter >= 6000) {
			this.caloryCounter /= 2;
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
	
	

}
