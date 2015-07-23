package by.zamskoi.cv.goods.coffee.filter;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.goods.coffee.CoffeeInstant;
import by.zamskoi.cv.goods.coffee.CoffeeInstant.CoffeeInstantForm;

public class CoffeeInstantFormFilter {
	private ArrayList<CoffeeInstant> filterCoffeeInstantForm(
			ArrayList<CoffeeInstant> coffeeInstantList,
			CoffeeInstantForm coffeeForm) {
		ArrayList<CoffeeInstant> filteredList = new ArrayList<CoffeeInstant>();
		for (CoffeeInstant i : coffeeInstantList) {
			if (i.getForm() == coffeeForm) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}
	
	public ArrayList<CoffeeInstant> filterGoodsByCoffeeInstantForm(
			ArrayList<AbstractGoodsItem> goodsList,
			CoffeeInstantForm coffeeForm) {
		CoffeeInstantFilter filter = new CoffeeInstantFilter();
		ArrayList<CoffeeInstant> coffeeInstantList = filter.filterCoffeeInstant(goodsList);
		ArrayList<CoffeeInstant> filteredList = this.filterCoffeeInstantForm(coffeeInstantList, coffeeForm);
		return filteredList;
	}
}
