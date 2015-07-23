package by.zamskoi.cv.goods.tea.action;

import java.util.GregorianCalendar;
import java.util.Random;

import by.zamskoi.cv.goods.tea.FictionTea;
import by.zamskoi.cv.goods.tea.FictionTea.TeaType;
import by.zamskoi.cv.pack.GoodsPack;
import by.zamskoi.cv.pack.action.PackCreator;

public class TeaCreator {
	public static FictionTea createFictionTea() {
		Random generator = new Random();
		int id = generator.nextInt();
		String name = "pr" + String.valueOf(id);
		double price = generator.nextDouble() * 10;
		GoodsPack pack = PackCreator.create();
		return new FictionTea(id, name, price, pack, new GregorianCalendar(),
				"Tea Boss", "India", TeaType.GREEN);
	}
}
