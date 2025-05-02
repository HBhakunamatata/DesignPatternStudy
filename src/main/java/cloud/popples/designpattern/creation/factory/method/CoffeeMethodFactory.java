package cloud.popples.designpattern.creation.factory.method;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;

/**
 * @description: 咖啡的方法工厂模式
 * @author: Mr.Han
 * @create: 2025-05-02 12:59
 */

public interface CoffeeMethodFactory {

    Coffee createCoffee();

}
