package cloud.popples.designpattern.behavior.memento;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * @description: 备忘录模式测试类
 * @author: Mr.Han
 * @create: 2025-05-08 18:38
 */

public class MementoTest {

    private SaveService saveService = new SaveService();;

    @Test
    void testMementoSetAndRestore() {
        KnightStatus knightStatus = new KnightStatus(100, 100, 100);
        saveService.setMemento(knightStatus.createMemento());
        System.out.println(knightStatus);
        knightStatus.die();
        System.out.println(knightStatus);
        knightStatus.restoreMemento(saveService.getMemento().get());
        System.out.println(knightStatus);
    }

}
