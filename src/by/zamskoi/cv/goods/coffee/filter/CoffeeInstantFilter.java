package by.zamskoi.cv.goods.coffee.filter;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.accounting.AbstractGoodsFilter;
import by.zamskoi.cv.goods.coffee.CoffeeInstant;

public class CoffeeInstantFilter extends AbstractGoodsFilter {
	public ArrayList<CoffeeInstant> filterCoffeeInstant(ArrayList<AbstractGoodsItem> goodsList){
		ArrayList<CoffeeInstant> filteredList = super.filter(goodsList, new CoffeeInstant());
		return filteredList;
	}
}
