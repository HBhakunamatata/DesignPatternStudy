package cloud.popples.designpattern.creation.factory.abstract_factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 抽象方法模式：套餐测试类
 * @author: Mr.Han
 * @create: 2025-05-02 14:16
 */

public class AbstractComboFactoryTest {

    @Test
    void testComboOne() {
        ComboFactory comboOneFactory = new ComboOneFactory();
        AbstractCoffeeStore store = new AbstractCoffeeStore(comboOneFactory);
        Assertions.assertEquals(
            "Dessert Cookie and Coffee America are served",
            store.orderCombo()
       );
    }

    @Test
    void testComboTwo() {
        ComboFactory comboTwoFactory = new ComboTwoFactory();
        AbstractCoffeeStore store = new AbstractCoffeeStore(comboTwoFactory);
        Assertions.assertEquals(
            "Dessert Ice Cream and Coffee Latte are served",
            store.orderCombo()
        );
    }

}
