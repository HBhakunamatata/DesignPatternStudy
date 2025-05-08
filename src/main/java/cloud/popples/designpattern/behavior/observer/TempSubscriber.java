package cloud.popples.designpattern.behavior.observer;

/**
 * @description: 太空舱温度订阅者
 * @author: Mr.Han
 * @create: 2025-05-08 15:30
 */

public class TempSubscriber implements Observer {

    @Override
    public void update(Object msg) {
        System.out.println("Got temperature message: " + msg);
    }
}
