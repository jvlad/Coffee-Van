package by.zamskoi.cv.goods.coffee.filter;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.accounting.AbstractGoodsFilter;
import by.zamskoi.cv.goods.coffee.CoffeeNatural;

public class CoffeeNaturalFilter extends AbstractGoodsFilter {
	public ArrayList<CoffeeNatural> filterCoffeeInstant(ArrayList<AbstractGoodsItem> goodsList){
		ArrayList<CoffeeNatural> filteredList = super.filter(goodsList, new CoffeeNatural());
		return filteredList;
	}
}
