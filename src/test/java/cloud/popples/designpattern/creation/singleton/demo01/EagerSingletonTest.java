package cloud.popples.designpattern.creation.singleton.demo01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @description: 饿汉单例-方法1 ：静态变量 测试类
 * @author: Mr.Han
 * @create: 2025-05-01 14:19
 */

public class EagerSingletonTest {

    @Test
    public void testTwoSingletonEqualsThenReturnTrue() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        Assertions.assertSame(eagerSingleton, eagerSingleton2);
    }

}
