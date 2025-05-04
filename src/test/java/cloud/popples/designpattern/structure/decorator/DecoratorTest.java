package cloud.popples.designpattern.structure.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 装饰器测试类
 * @author: Mr.Han
 * @create: 2025-05-04 15:46
 */

public class DecoratorTest {

    @Test
    void testFriedRiceAddEgg() {
        MainFood friedRice = new FriedRice("炒饭", 10.0f);
        Egg addedEgg = new Egg(friedRice, "鸡蛋", 1.0f);
        Assertions.assertSame(0, Float.compare(11.0f, addedEgg.cost()));
    }

}
