package cloud.popples.designpattern.creation.factory.simple;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.coffee.AmericaCoffee;
import cloud.popples.designpattern.creation.factory.coffee.LatteCoffee;

/**
 * @description: 简单工厂模式-咖啡工厂
 * @author: Mr.Han
 * @create: 2025-05-02 10:13
 */

public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String coffeeType) {
        Coffee result = null;
        switch (coffeeType) {
            case "latte":
                result = new LatteCoffee("Latte");
                break;
            case "america":
                result = new AmericaCoffee("America");
                break;
            default:
                throw new RuntimeException("No such coffee type: " + coffeeType);
        }
        return result;
    }

}
