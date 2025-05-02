package cloud.popples.designpattern.creation.factory.config_factory;

import cloud.popples.designpattern.creation.factory.coffee.AmericaCoffee;
import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import cloud.popples.designpattern.creation.factory.coffee.LatteCoffee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 基于config_factory的咖啡店测试类
 * @author: Mr.Han
 * @create: 2025-05-02 21:21
 */

public class ConfigFactoryTest {

    @Test
    public void testConfigFactory() {
        ConfigCoffeeStore store = new ConfigCoffeeStore();
        Coffee latte = store.createCoffee("latte");
        Assertions.assertInstanceOf(LatteCoffee.class, latte);

        Coffee america = store.createCoffee("america");
        Assertions.assertInstanceOf(AmericaCoffee.class, america);
    }

}
