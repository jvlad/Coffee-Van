package by.zamskoi.cv.goods.coffee.filter;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.goods.coffee.AbstractCoffee;
import by.zamskoi.cv.goods.coffee.AbstractCoffee.CoffeeSort;

public class CoffeeSortFilter {
	private ArrayList<AbstractCoffee> filterCoffeeSort(ArrayList<AbstractCoffee> coffeeList,
			CoffeeSort coffeeSort) {
		ArrayList<AbstractCoffee> filteredList = new ArrayList<AbstractCoffee>();
		for (AbstractCoffee i : coffeeList) {
			if (i.getSort() == coffeeSort) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}
	
	public ArrayList<AbstractCoffee> filterGoodsByCoffeeSort(ArrayList<AbstractGoodsItem> goodsList,
			CoffeeSort coffeeSort){
		CoffeeFilter filterCoffee = new CoffeeFilter();
		ArrayList<AbstractCoffee> coffeeList = filterCoffee.filter(goodsList);
		ArrayList<AbstractCoffee> filteredList = this.filterCoffeeSort(coffeeList, coffeeSort);
		return filteredList;
	}
}
