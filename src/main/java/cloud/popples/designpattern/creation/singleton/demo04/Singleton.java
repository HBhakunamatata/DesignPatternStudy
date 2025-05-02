package cloud.popples.designpattern.creation.singleton.demo04;

/**
 * @description: 懒汉单例-线程安全
 * @author: Mr.Han
 * @create: 2025-05-01 14:36
 */

public class Singleton {

    private static volatile Singleton instance;

    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("Singleton was initialized more than one time");
            }
            flag = true;
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {
        return instance;
    }

}
