package cloud.popples.designpattern.creation.factory.simple;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 简单工厂模式-咖啡工厂测试类
 * @author: Mr.Han
 * @create: 2025-05-02 10:20
 */

public class SimpleCoffeeFactoryTest {

    @Test
    void test() {
        SimpleCoffeeStore coffeeStore = new SimpleCoffeeStore();
        Coffee latte = coffeeStore.orderCoffee("latte");
        Assertions.assertEquals("Latte", latte.getName());
    }

}
