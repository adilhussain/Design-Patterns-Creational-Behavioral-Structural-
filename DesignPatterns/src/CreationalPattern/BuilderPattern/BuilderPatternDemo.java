package CreationalPattern.BuilderPattern;

/*
 * 
 * 
 * Builder pattern builds a complex object
 *  using simple objects and using a step by step approach. 
 *  This type of design pattern comes under creational pattern 
 *  as this pattern provides one of the best ways to create an 
 *  object.
	A Builder class builds the final object step by step. This builder is independent of other objects.
 * 
 * 
 * 
 */


public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.PrepareVegMeal();
		Meal NonVegMeal = builder.prepareNonVegMeal();
		vegMeal.ShowItems();
		System.out.println("Sum:: " + vegMeal.getCost());
		System.out.println();
		NonVegMeal.ShowItems();
		System.out.println("Sum:: " + NonVegMeal.getCost());
	}

}
