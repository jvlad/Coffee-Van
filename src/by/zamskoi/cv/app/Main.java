package by.zamskoi.cv.app;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;

import by.zamskoi.cv.goods.AbstractGoodsItem;

import by.zamskoi.cv.goods.coffee.AbstractCoffee;
import by.zamskoi.cv.goods.coffee.AbstractCoffee.CoffeeSort;

import by.zamskoi.cv.goods.coffee.action.CoffeeCreator;

import by.zamskoi.cv.goods.coffee.filter.CoffeeFilter;
import by.zamskoi.cv.goods.coffee.filter.CoffeeSortFilter;

import by.zamskoi.cv.goods.tea.action.TeaCreator;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log4j.xml",
                LogManager.getLoggerRepository());
    }

    public static void main(String[] args) {
        AbstractGoodsItem product1 = CoffeeCreator.createCoffeeNatural();
        AbstractGoodsItem product2 = CoffeeCreator.createCoffeeInstant();
        AbstractGoodsItem product3 = TeaCreator.createFictionTea();
        AbstractGoodsItem product4 = CoffeeCreator.createCoffeeInstant();
        AbstractGoodsItem product5 = CoffeeCreator.createCoffeeNatural();
        AbstractGoodsItem product6 = CoffeeCreator.createCoffeeInstant();
        ArrayList<AbstractGoodsItem> drinksList = new ArrayList<AbstractGoodsItem>();
        drinksList.add(product1);
        drinksList.add(product2);
        drinksList.add(product3);
        drinksList.add(product4);
        drinksList.add(product5);
        drinksList.add(product6);
        CoffeeFilter coffeeFilter = new CoffeeFilter();
        ArrayList<AbstractCoffee> coffeeList = coffeeFilter.filter(drinksList);
        System.out.println(coffeeList.size());

        CoffeeSortFilter sortFilter = new CoffeeSortFilter();
        coffeeList = sortFilter.filterGoodsByCoffeeSort(drinksList,
                CoffeeSort.ARABICA);
        System.out.println(coffeeList.size());

    }
}
