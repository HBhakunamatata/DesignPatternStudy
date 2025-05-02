package cloud.popples.designpattern.creation.singleton.demo02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 饿汉单例枚举测试类
 * @author: Mr.Han
 * @create: 2025-05-01 15:25
 */

public class SingletonTest {

    @Test
    void testTwoEnumInstanceEqualsThenReturnTrue() {
        Singleton thisOne = Singleton.INSTANCE;
        Singleton otherOne = Singleton.INSTANCE;
        Assertions.assertSame(thisOne, otherOne);
    }

}
