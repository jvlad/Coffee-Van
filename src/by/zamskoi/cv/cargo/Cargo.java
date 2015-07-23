package by.zamskoi.cv.cargo;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import by.zamskoi.cv.goods.AbstractGoodsItem;

public class Cargo {
	public static final Logger LOG = Logger.getLogger(Cargo.class);
	private long id;
	private double volume;
	private double weight;
	private double price;
	private ArrayList<AbstractGoodsItem> goodsItems = new ArrayList<AbstractGoodsItem>();

	public Cargo() {
		super();
	}

	public Cargo(long id, ArrayList<AbstractGoodsItem> goodsItems) {
		super();
		this.id = id;
		this.goodsItems = goodsItems;
	}

	public Cargo(long id, double volume, double weight, double price,
			ArrayList<AbstractGoodsItem> goodsItems) {
		super();
		this.id = id;
		this.volume = volume;
		this.weight = weight;
		this.price = price;
		this.goodsItems = goodsItems;
	}

	// TODO refactor the set() methods
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public AbstractGoodsItem getGoodsItem(int itemIndex) {
		return goodsItems.get(itemIndex);
	}

	public int getGoodsNumber() {
		return goodsItems.size();
	}

//	public ArrayList<GoodsItem> getGoodsItemsCopy() {
//		return (ArrayList<GoodsItem>)goodsItems.clone();
//	}

	public void setGoodsItems(ArrayList<AbstractGoodsItem> goodsItems) {
		this.goodsItems = goodsItems;
	}

	public void addGoodsItem(AbstractGoodsItem goods) {
		this.goodsItems.add(goods);
	}

}
