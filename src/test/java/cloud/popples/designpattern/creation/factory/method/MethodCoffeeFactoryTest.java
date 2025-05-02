package cloud.popples.designpattern.creation.factory.method;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 方法工厂模式测试类
 * @author: Mr.Han
 * @create: 2025-05-02 13:09
 */

public class MethodCoffeeFactoryTest {

    @Test
    void createLatte() {
        CoffeeMethodFactory factory = new LatteCoffeeFactory();
        MethodCoffeeStore store = new MethodCoffeeStore(factory);
        Coffee latte = store.orderCoffee();
        Assertions.assertEquals("Latte", latte.getName());
    }

    @Test
    void createAmerica() {
        CoffeeMethodFactory factory = new AmericaCoffeeFactory();
        MethodCoffeeStore store = new MethodCoffeeStore(factory);
        Coffee ame = store.orderCoffee();
        Assertions.assertEquals("America", ame.getName());
    }

}
