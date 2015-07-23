package by.zamskoi.cv.goods.coffee;

import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import by.zamskoi.cv.pack.GoodsPack;

public class CoffeeNatural extends AbstractCoffee {
	public static final Logger LOG = Logger.getLogger(CoffeeNatural.class);
	private CoffeeGrade grade;
	private CoffeeState state;
	private CoffeeRoastingLevel roastingLevel;

	public enum CoffeeRoastingLevel {
		LIGHT, MEDIUM, DARK, EXTRADARK
	}

	public enum CoffeeGrade {
		HIGH, EXTRA, PREMIUM
	}

	public enum CoffeeState {
		BEANS, GROUND
	}

	public CoffeeNatural() {
		super();
	}

	public CoffeeNatural(long id, String name, double price, GoodsPack pack,
			GregorianCalendar expirationDate, String manufacturer,
			String manufacturerCountry, CoffeeSort sort, CoffeeGrade grade,
			CoffeeState state, CoffeeRoastingLevel roastingLevel) {
		super(id, name, price, pack, expirationDate, manufacturer,
				manufacturerCountry, sort);
		this.grade = grade;
		this.state = state;
		this.roastingLevel = roastingLevel;
	}

	// TODO refactor the set() methods
	public CoffeeGrade getGrade() {
		return grade;
	}

	public void setGrade(CoffeeGrade grade) {
		this.grade = grade;
	}

	public CoffeeState getState() {
		return state;
	}

	public void setState(CoffeeState state) {
		this.state = state;
	}

	public CoffeeRoastingLevel getRoastingLevel() {
		return roastingLevel;
	}

	public void setRoastingLevel(CoffeeRoastingLevel roastingLevel) {
		this.roastingLevel = roastingLevel;
	}

}
