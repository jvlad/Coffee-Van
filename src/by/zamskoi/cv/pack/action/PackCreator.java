package by.zamskoi.cv.pack.action;

import java.util.Random;

import by.zamskoi.cv.pack.GoodsPack;
import by.zamskoi.cv.pack.GoodsPack.GoodsPackType;

public class PackCreator {
	public static GoodsPack create() {
		Random generator = new Random();
		return new GoodsPack(GoodsPackType.PARCEL, generator.nextDouble() * 10,
				generator.nextDouble() * 10, generator.nextDouble() * 10,
				generator.nextDouble() * 10, "Polyester");

	}
}
