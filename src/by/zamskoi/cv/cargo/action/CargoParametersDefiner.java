package by.zamskoi.cv.cargo.action;

import java.util.ArrayList;

import by.zamskoi.cv.cargo.Cargo;
import by.zamskoi.cv.goods.AbstractGoodsItem;

public class CargoParametersDefiner {
	public static double defineVolume(Cargo cargo){
		ArrayList<AbstractGoodsItem> goodsList = CargoGoodsListCopier.copyGoodsList(cargo);
		double volume = 0;
		for (AbstractGoodsItem i : goodsList) {
			volume += i.getPack().getVolume();
		}
		return volume;
	}
	
	public static double defineWeight(Cargo cargo){
		ArrayList<AbstractGoodsItem> goodsList = CargoGoodsListCopier.copyGoodsList(cargo);
		double weight = 0;
		for (AbstractGoodsItem i : goodsList) {
			weight += i.getPack().getWeight();
		}
		return weight;
	}
	
	public static double definePrice(Cargo cargo){
		ArrayList<AbstractGoodsItem> goodsList = CargoGoodsListCopier.copyGoodsList(cargo);
		double price = 0;
		for (AbstractGoodsItem i : goodsList) {
			price += i.getPrice();
		}
		return price;
	}
}
