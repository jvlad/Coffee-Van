package by.zamskoi.cv.accounting;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import by.zamskoi.cv.goods.AbstractGoodsItem;

public class GoodsRangeFilter {
	public enum GoodsRangeFilterProperty {
		PRICE, VOLUME, WEIGHT, DATE
	}

	private ArrayList<AbstractGoodsItem> filterByPrice(
			ArrayList<AbstractGoodsItem> goodsList, double minimumValue,
			double maximumValue) {
		ArrayList<AbstractGoodsItem> filteredList = new ArrayList<AbstractGoodsItem>();
		for (AbstractGoodsItem i : goodsList) {
			double valueToCompare = i.getPrice();
			if ((Double.compare(valueToCompare, minimumValue) == 1)
					&& (Double.compare(valueToCompare, maximumValue) == -1)) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}

	private ArrayList<AbstractGoodsItem> filterByVolume(
			ArrayList<AbstractGoodsItem> goodsList, double minimumValue,
			double maximumValue) {
		ArrayList<AbstractGoodsItem> filteredList = new ArrayList<AbstractGoodsItem>();
		for (AbstractGoodsItem i : goodsList) {
			double valueToCompare = i.getPack().getVolume();
			if ((Double.compare(valueToCompare, minimumValue) == 1)
					&& (Double.compare(valueToCompare, maximumValue) == -1)) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}

	private ArrayList<AbstractGoodsItem> filterByWeight(
			ArrayList<AbstractGoodsItem> goodsList, double minimumValue,
			double maximumValue) {
		ArrayList<AbstractGoodsItem> filteredList = new ArrayList<AbstractGoodsItem>();
		for (AbstractGoodsItem i : goodsList) {
			double valueToCompare = i.getPack().getNetWeight();
			if ((Double.compare(valueToCompare, minimumValue) == 1)
					&& (Double.compare(valueToCompare, maximumValue) == -1)) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}

	private ArrayList<AbstractGoodsItem> filterByDate(
			ArrayList<AbstractGoodsItem> goodsList,
			GregorianCalendar minimumValue, GregorianCalendar maximumValue) {
		ArrayList<AbstractGoodsItem> filteredList = new ArrayList<AbstractGoodsItem>();
		for (AbstractGoodsItem i : goodsList) {
			GregorianCalendar valueToCompare = i.getExpirationDate();
			if (valueToCompare.after(minimumValue)
					&& valueToCompare.before(maximumValue)) {
				filteredList.add(i);
			}
		}
		return filteredList;
	}

	public <T> ArrayList<AbstractGoodsItem> filter(
			ArrayList<AbstractGoodsItem> goodsList,
			GoodsRangeFilterProperty property, T minimumValue, T maximumValue) {
		ArrayList<AbstractGoodsItem> filteredList = new ArrayList<AbstractGoodsItem>();
		switch (property) {
		case PRICE: {
			filteredList = this.filterByPrice(goodsList, (Double) minimumValue,
					(Double) maximumValue);
		}
			break;
		case VOLUME: {
			filteredList = this.filterByVolume(goodsList,
					(Double) minimumValue, (Double) maximumValue);

		}
			break;
		case WEIGHT: {
			filteredList = this.filterByWeight(goodsList,
					(Double) minimumValue, (Double) maximumValue);
		}
			break;
		case DATE: {
			filteredList = this.filterByDate(goodsList,
					(GregorianCalendar) minimumValue,
					(GregorianCalendar) maximumValue);
		}
			break;
		default: {
			throw new IllegalArgumentException(
					"You should specify one of the avaliable filter properties: "
							+ GoodsRangeFilterProperty.values()
							+ "/nBut specified property is" + property);
		}
		}
		return filteredList;
	}
}
