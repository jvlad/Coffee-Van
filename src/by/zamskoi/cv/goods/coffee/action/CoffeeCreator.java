package by.zamskoi.cv.goods.coffee.action;

import java.util.GregorianCalendar;
import java.util.Random;

import by.zamskoi.cv.goods.coffee.CoffeeInstant;
import by.zamskoi.cv.goods.coffee.CoffeeInstant.CoffeeInstantForm;
import by.zamskoi.cv.goods.coffee.CoffeeNatural;
import by.zamskoi.cv.goods.coffee.AbstractCoffee.CoffeeSort;
import by.zamskoi.cv.goods.coffee.CoffeeNatural.CoffeeGrade;
import by.zamskoi.cv.goods.coffee.CoffeeNatural.CoffeeRoastingLevel;
import by.zamskoi.cv.goods.coffee.CoffeeNatural.CoffeeState;
import by.zamskoi.cv.pack.GoodsPack;
import by.zamskoi.cv.pack.action.PackCreator;

public class CoffeeCreator {
	public static CoffeeNatural createCoffeeNatural(){
		Random generator = new Random();
		int id = generator.nextInt();
		String name = "pr" + String.valueOf(id);
		double price = generator.nextDouble()*10;
		GoodsPack pack = PackCreator.create();
		return new CoffeeNatural(id, name, price, pack, new GregorianCalendar(), "Coffee Boss",
				"India", CoffeeSort.ARABICA, CoffeeGrade.EXTRA, CoffeeState.BEANS,
				CoffeeRoastingLevel.DARK);
	}
	
	public static CoffeeInstant createCoffeeInstant(){
		Random generator = new Random();
		int id = generator.nextInt();
		String name = "pr" + String.valueOf(id);
		double price = generator.nextDouble()*10;
		GoodsPack pack = PackCreator.create();
		return new CoffeeInstant(id, name, price, pack, new GregorianCalendar(), "Coffee Boss",
				"India", CoffeeSort.ROBUSTA, CoffeeInstantForm.POWDER);
	}
	
}
