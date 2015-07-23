package by.zamskoi.cv.accounting;

import java.util.ArrayList;

import by.zamskoi.cv.goods.AbstractGoodsItem;

public abstract class AbstractGoodsFilter {
	@SuppressWarnings("unchecked")
	protected <T, V extends AbstractGoodsItem> ArrayList<T> filter(
			ArrayList<V> goodsList, T obj) {
		ArrayList<T> filteredList = new ArrayList<T>();
		for (V i : goodsList) {
			if (i.getClass().getClass().equals(obj.getClass())) {
				filteredList.add((T) i);
			}
		}
		return filteredList;
	}
}
