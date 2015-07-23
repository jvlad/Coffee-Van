package by.zamskoi.cv.goods.coffee.filter;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.goods.coffee.AbstractCoffee;

public class CoffeeFilter {
	public ArrayList <AbstractCoffee> filter(
			ArrayList<AbstractGoodsItem> goodsList) {
		ArrayList<AbstractCoffee> filteredList = new ArrayList<AbstractCoffee>();
		for (AbstractGoodsItem i : goodsList) {
			if (i.getClass().getSuperclass().equals(AbstractCoffee.class)) {
				filteredList.add((AbstractCoffee) i);
			}
		}
		return filteredList;
	}
}
