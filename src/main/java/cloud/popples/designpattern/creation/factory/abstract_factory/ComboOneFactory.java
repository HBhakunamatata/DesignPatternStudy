package cloud.popples.designpattern.creation.factory.abstract_factory;

import cloud.popples.designpattern.creation.factory.coffee.AmericaCoffee;
import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.dessert.Cookie;
import cloud.popples.designpattern.creation.factory.dessert.Dessert;

/**
 * @description: 套餐一工厂
 * @author: Mr.Han
 * @create: 2025-05-02 13:58
 */

public class ComboOneFactory implements ComboFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee("America");
    }

    @Override
    public Dessert createDessert() {
        return new Cookie("Cookie");
    }
}
