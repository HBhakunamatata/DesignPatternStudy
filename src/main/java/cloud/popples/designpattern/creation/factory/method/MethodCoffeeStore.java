package cloud.popples.designpattern.creation.factory.method;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;

/**
 * @description: 使用方法工厂的咖啡店类
 * @author: Mr.Han
 * @create: 2025-05-02 13:05
 */

public class MethodCoffeeStore {

    private CoffeeMethodFactory factory;

    public MethodCoffeeStore(CoffeeMethodFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.createCoffee();
    }

}
