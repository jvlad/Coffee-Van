package by.zamskoi.cv.cargo.action;

import java.util.ArrayList;

import by.zamskoi.cv.cargo.Cargo;
import by.zamskoi.cv.goods.AbstractGoodsItem;

class CargoGoodsListCopier {
	static ArrayList<AbstractGoodsItem> copyGoodsList(Cargo cargo) {
		ArrayList<AbstractGoodsItem> goodsList = new ArrayList<AbstractGoodsItem>();
		int goodsNumber = cargo.getGoodsNumber();
		for (int i = 0; i < goodsNumber; i++) {
			goodsList.add(cargo.getGoodsItem(i));
		}
		return goodsList;
	}
}