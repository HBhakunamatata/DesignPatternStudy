package cloud.popples.designpattern.creation.factory.simple;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;

/**
 * @description: 咖啡店
 * @author: Mr.Han
 * @create: 2025-05-02 10:13
 */

public class SimpleCoffeeStore {

    public Coffee orderCoffee(String coffeeType) {
        return SimpleCoffeeFactory.createCoffee(coffeeType);
    }


}
