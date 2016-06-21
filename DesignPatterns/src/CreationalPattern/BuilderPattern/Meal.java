package CreationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	List<Item> list;
	public Meal(){
		list = new ArrayList<Item>();
	}
	public boolean addItem(Item item){
		return list.add(item);
	}
	
	public double getCost(){
		double sum = 0;
		for(Item item : list){
			sum+=item.cost();
		}
		return sum;
	}
	public void ShowItems(){
		for(Item item : list){
			System.out.println(item.name() + " " + item.cost());
		}
	}
}
