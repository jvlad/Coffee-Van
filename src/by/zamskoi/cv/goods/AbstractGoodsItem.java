package by.zamskoi.cv.goods;

import java.util.GregorianCalendar;

import org.apache.log4j.Logger;

import by.zamskoi.cv.pack.GoodsPack;

public abstract class AbstractGoodsItem {
	public static final Logger LOG = Logger.getLogger(AbstractGoodsItem.class);
	private long id;
	private String name;
	private double price;
	private GoodsPack pack;
	private GregorianCalendar expirationDate;
	private String manufacturer;
	private String originCountry;

	public AbstractGoodsItem() {
		super();
	}

	public AbstractGoodsItem(long id, String name, double price,
			GoodsPack pack, GregorianCalendar expirationDate,
			String manufacturer, String manufacturerCountry) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.pack = pack;
		this.expirationDate = expirationDate;
		this.manufacturer = manufacturer;
		this.originCountry = manufacturerCountry;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			LOG.error("Price setting was failed. Price should be positive. But specified price is "
					+ String.valueOf(price));
			throw new IllegalArgumentException(
					"Price should be positive. But specified price is "
							+ price);
		}
	}

	public GoodsPack getPack() {
		return pack;
	}

	public void setPack(GoodsPack pack) {
		this.pack = pack;
	}

	public GregorianCalendar getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(GregorianCalendar expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturerCountry() {
		return originCountry;
	}

	public void setManufacturerCountry(String manufacturerCountry) {
		this.originCountry = manufacturerCountry;
	}

}
