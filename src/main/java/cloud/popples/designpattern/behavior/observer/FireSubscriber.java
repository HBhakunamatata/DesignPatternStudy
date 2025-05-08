package cloud.popples.designpattern.behavior.observer;

/**
 * @description: 太空舱火焰订阅者
 * @author: Mr.Han
 * @create: 2025-05-08 15:42
 */

public class FireSubscriber implements Observer{

    @Override
    public void update(Object msg) {
        System.out.println("Got fire message: " + msg);
    }
}
