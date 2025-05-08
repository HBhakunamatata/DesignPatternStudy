package cloud.popples.designpattern.behavior.observer;

import org.junit.jupiter.api.Test;

/**
 * @description: 观察者模式测试类
 * @author: Mr.Han
 * @create: 2025-05-08 15:54
 */

public class ObserverTest {

    @Test
    void testNotifyAll() {
        SpaceCentralController controller = new SpaceCentralController();
        controller.subscribe(new FireSubscriber());
        controller.subscribe(new TempSubscriber());

        controller.notifyObservers("hello");
    }

}
