package cloud.popples.designpattern.creation.factory.method;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.coffee.LatteCoffee;

/**
 * @description: 拿铁咖啡的方法工厂
 * @author: Mr.Han
 * @create: 2025-05-02 13:01
 */

public class LatteCoffeeFactory implements CoffeeMethodFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee("Latte");
    }
}
