package cloud.popples.designpattern.creation.factory.abstract_factory;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.coffee.LatteCoffee;
import cloud.popples.designpattern.creation.factory.dessert.Dessert;
import cloud.popples.designpattern.creation.factory.dessert.IceCream;

/**
 * @description: 套餐二工厂
 * @author: Mr.Han
 * @create: 2025-05-02 13:59
 */

public class ComboTwoFactory implements ComboFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee("Latte");
    }

    @Override
    public Dessert createDessert() {
        return new IceCream("Ice Cream");
    }
}
