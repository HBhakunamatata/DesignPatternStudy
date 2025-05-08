package cloud.popples.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 太空舱中心控制器
 * @author: Mr.Han
 * @create: 2025-05-08 15:45
 */

public class SpaceCentralController {

    private List<Observer> observers;

    public SpaceCentralController() {
        observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

}
