package CreationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class MealBuilder1 {
	List<Item> list;
	public MealBuilder1() {
		list = new ArrayList<Item>();
	}
	public void prepareVegMeal(){
		list.add(new VegBurger());
		list.add(new Pepsi());
	}
	public void prepareNonVegMeal(){
		list.add(new NonVegBurger());
		list.add(new Coke());
	}
	public double getCost(List<Item> list){
		double sum = 0.0;
		for(Item item:list){
			sum+=item.cost();
		}
		return sum;
	}
	public void showMeal(List<Item> meal){
		for(Item item:meal){
			System.out.println(item.name() + " " + item.cost());
		}
	}
}
