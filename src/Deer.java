

/*Deer - Will only eat Plants, needs 1200 calories */


class Deer implements Animal {
	private int caloryCounter = 0;
	FoodType foodType = FoodType.PLANTS;

	
	

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
		
		if(this.caloryCounter >= 1200) {
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

	

	
	
	


