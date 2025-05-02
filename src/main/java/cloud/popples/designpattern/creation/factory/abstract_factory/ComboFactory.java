package cloud.popples.designpattern.creation.factory.abstract_factory;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.dessert.Dessert;

/**
 * @description: 套餐抽象工厂
 * @author: Mr.Han
 * @create: 2025-05-02 13:56
 */

public interface ComboFactory {

    Coffee createCoffee();

    Dessert createDessert();

}
