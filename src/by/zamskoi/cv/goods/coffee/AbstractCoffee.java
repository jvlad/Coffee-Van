package by.zamskoi.cv.goods.coffee;

import java.util.GregorianCalendar;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.pack.GoodsPack;

public abstract class AbstractCoffee extends AbstractGoodsItem {
	private CoffeeSort sort;
	
	public enum CoffeeSort {
		ARABICA("Coffea arabica"), ROBUSTA("Coffea canephora");
		String pluntSpecies;

		CoffeeSort(String pluntSpecies) {
			this.pluntSpecies = pluntSpecies;
		}
	}

	public AbstractCoffee() {
		super();
	}

	public AbstractCoffee(long id, String name, double price, GoodsPack pack,
			GregorianCalendar expirationDate, String manufacturer,
			String manufacturerCountry, CoffeeSort sort) {
		super(id, name, price, pack, expirationDate, manufacturer,
				manufacturerCountry);
		this.sort = sort;
	}

	public CoffeeSort getSort() {
		return sort;
	}

	public void setSort(CoffeeSort sort) {
		this.sort = sort;
	}

}
