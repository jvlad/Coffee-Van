package by.zamskoi.cv.goods.tea;

import java.util.GregorianCalendar;

import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.pack.GoodsPack;

public class FictionTea extends AbstractGoodsItem {
	private TeaType type;
	public enum TeaType{
		GREEN, BLACK
	}
	public FictionTea(long id, String name, double price, GoodsPack pack,
			GregorianCalendar expirationDate, String manufacturer,
			String manufacturerCountry, TeaType type) {
		super(id, name, price, pack, expirationDate, manufacturer,
				manufacturerCountry);
		this.type = type;
	}
	public TeaType getType() {
		return type;
	}
	public void setType(TeaType type) {
		this.type = type;
	}
}
