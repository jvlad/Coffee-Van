package by.zamskoi.cv.accounting;

import java.util.ArrayList;
import java.util.Comparator;

import by.zamskoi.cv.goods.AbstractGoodsItem;

public class GoodsSorter {
	private static final double DEFAULT_ACCURACY = 0.01;

	private static ArrayList<AbstractGoodsItem> sortByPriceAndWeight(
			ArrayList<AbstractGoodsItem> goodsList, double accuracy) {
		if (accuracy < 0) {
			throw new IllegalArgumentException(
					"Accuracy should be positive. But specified accuracy is "
							+ accuracy);
		}
		goodsList.sort(new Comparator<AbstractGoodsItem>() {
			@Override
			public int compare(AbstractGoodsItem arg0, AbstractGoodsItem arg1) {
				double priceWeightRatio0 = arg0.getPrice()
						/ arg0.getPack().getNetWeight();
				double priceWeightRatio1 = arg1.getPrice()
						/ arg1.getPack().getNetWeight();
				if (Math.abs(priceWeightRatio0 - priceWeightRatio1) < accuracy) {
					return 0;
				}
				return Double.compare(priceWeightRatio0, priceWeightRatio1);
			};
		});
		return goodsList;
	}

	public static ArrayList<AbstractGoodsItem> sortGoodsByPriceAndWeightDefaultAccuracy(
			ArrayList<AbstractGoodsItem> list) {
		ArrayList<AbstractGoodsItem> sortedList = sortByPriceAndWeight(list,
				DEFAULT_ACCURACY);
		return sortedList;
	}

	public static ArrayList<AbstractGoodsItem> sortGoodsByPriceAndWeightCustomAccuracy(
			ArrayList<AbstractGoodsItem> list, double accuracy) {
		ArrayList<AbstractGoodsItem> sortedList = sortByPriceAndWeight(list,
				accuracy);
		return sortedList;
	}

}
