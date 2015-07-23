package by.zamskoi.cv.cargo.action;

import java.util.ArrayList;

import by.zamskoi.cv.cargo.Cargo;
import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.accounting.GoodsSorter;

public class CargoGoodsSorter {

	public static ArrayList<AbstractGoodsItem> sortCargoGoodsByPriceAndWeightCustomAccuracy(
			Cargo cargo, double accuracy) {
		ArrayList<AbstractGoodsItem> goodsListCopy = CargoGoodsListCopier
				.copyGoodsList(cargo);
		ArrayList<AbstractGoodsItem> sortedList = GoodsSorter
				.sortGoodsByPriceAndWeightCustomAccuracy(goodsListCopy,
						accuracy);
		return sortedList;
	}

	public static ArrayList<AbstractGoodsItem> sortCargoGoodsByPriceAndWeightDefaultAccuracy(
			Cargo cargo) {
		ArrayList<AbstractGoodsItem> goodsListCopy = CargoGoodsListCopier
				.copyGoodsList(cargo);
		ArrayList<AbstractGoodsItem> sortedList = GoodsSorter
				.sortGoodsByPriceAndWeightDefaultAccuracy(goodsListCopy);
		return sortedList;
	}
}
