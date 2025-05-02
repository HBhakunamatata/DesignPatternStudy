package cloud.popples.designpattern.creation.singleton.demo03;

import java.io.Serializable;

/**
 * @description: 懒汉单例-非线程安全
 * @author: Mr.Han
 * @create: 2025-05-01 14:32
 */

public class LazySingleton implements Serializable {

    private static LazySingleton instance;

    private static boolean isInitialized = false;

    private LazySingleton() {
        if (isInitialized) {
            throw new RuntimeException("Singleton was initialized more than one time");
        }
        isInitialized = true;
    }

    public static LazySingleton getInstance() {
        if (instance == null ) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }

}
