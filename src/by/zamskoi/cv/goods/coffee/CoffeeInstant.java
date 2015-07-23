package by.zamskoi.cv.goods.coffee;

import java.util.GregorianCalendar;

import by.zamskoi.cv.pack.GoodsPack;

public class CoffeeInstant extends AbstractCoffee {
	private CoffeeInstantForm form;

	public enum CoffeeInstantForm {
		POWDER, GRANULATED
	}

	public CoffeeInstant() {
		super();
	}

	public CoffeeInstant(long id, String name, double price, GoodsPack pack,
			GregorianCalendar expirationDate, String manufacturer,
			String manufacturerCountry, CoffeeSort sort, CoffeeInstantForm form) {
		super(id, name, price, pack, expirationDate, manufacturer,
				manufacturerCountry, sort);
		this.form = form;
	}

	public CoffeeInstantForm getForm() {
		return form;
	}

	public void setCoffeeInstantForm(CoffeeInstantForm form) {
		this.form = form;
	}

}
