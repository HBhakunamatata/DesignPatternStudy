package cloud.popples.designpattern.creation.singleton.demo01;

/**
 * @description: 饿汉式单例-方式1 ：静态变量
 * @author: Mr.Han
 * @create: 2025-05-01 14:17
 */

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        if (instance != null) {
            throw new RuntimeException("Singleton was initialized more than one time");
        }
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public Object readResolve() {
        return instance;
    }

}
