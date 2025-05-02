package cloud.popples.designpattern.creation.factory.abstract_factory;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.dessert.Dessert;

/**
 * @description: 基于抽象工厂的甜品店
 * @author: Mr.Han
 * @create: 2025-05-02 14:01
 */

public class AbstractCoffeeStore {

    private ComboFactory comboFactory;

    public AbstractCoffeeStore(ComboFactory comboFactory) {
        this.comboFactory = comboFactory;
    }

    public String orderCombo() {
        Coffee coffee = comboFactory.createCoffee();
        Dessert dessert = comboFactory.createDessert();
        return String.format("Dessert %s and Coffee %s are served",
            dessert.getName(), coffee.getName());
    }

}
