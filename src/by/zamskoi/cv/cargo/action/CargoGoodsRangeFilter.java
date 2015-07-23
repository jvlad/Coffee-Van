package by.zamskoi.cv.cargo.action;

import java.util.ArrayList;

import by.zamskoi.cv.cargo.Cargo;
import by.zamskoi.cv.goods.AbstractGoodsItem;
import by.zamskoi.cv.accounting.GoodsRangeFilter;
import by.zamskoi.cv.accounting.GoodsRangeFilter.GoodsRangeFilterProperty;

public class CargoGoodsRangeFilter {
	public <T> ArrayList<AbstractGoodsItem> filterWithRange(Cargo cargo,
			GoodsRangeFilterProperty property, T minimum, T maximum) {
		ArrayList<AbstractGoodsItem> goodsList = CargoGoodsListCopier.copyGoodsList(cargo);
		GoodsRangeFilter rangeFilter = new GoodsRangeFilter();
		ArrayList<AbstractGoodsItem> filteredList = rangeFilter.filter(goodsList,property, minimum, maximum);
		return filteredList;
	}
}
