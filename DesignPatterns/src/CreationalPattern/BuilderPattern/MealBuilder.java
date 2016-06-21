package CreationalPattern.BuilderPattern;

public class MealBuilder {
	public Meal PrepareVegMeal(){
		Meal meal  = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
