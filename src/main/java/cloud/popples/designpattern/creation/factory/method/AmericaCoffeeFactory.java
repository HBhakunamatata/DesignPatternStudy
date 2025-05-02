package cloud.popples.designpattern.creation.factory.method;

import cloud.popples.designpattern.creation.factory.coffee.AmericaCoffee;
import cloud.popples.designpattern.creation.factory.coffee.Coffee;

/**
 * @description: 美式咖啡方法工厂类
 * @author: Mr.Han
 * @create: 2025-05-02 13:05
 */

public class AmericaCoffeeFactory implements CoffeeMethodFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee("America");
    }
}
