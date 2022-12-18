

/*Wolf - Will only eat meat, 
 * needs 800 calories, but needs to eat at least 
 * 4 times before being sated*/

public class Wolf implements Animal{
	
	FoodType foodType = FoodType.MEAT;
	private int caloryCounter = 0;
	private int times = 0;

	@Override
	public void eat(FoodType food, int calories) {
		if(food.equals(foodType)) {
			//System.out.println(food);
			this.caloryCounter += calories;
			this.times+=1;
		}else {
			//System.out.println("Not an option");
		}
		
	}

	@Override
	public boolean isSated() {
		if(caloryCounter >= 800 && this.times >= 4) {
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

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	
	

}
