package cloud.popples.designpattern.creation.singleton.demo05;

/**
 * @description: 懒汉单例-静态内部类-线程安全
 *      推荐方式，利用虚拟机的机制保证线程安全性
 * @author: Mr.Han
 * @create: 2025-05-01 15:17
 */

public class Singleton {

    private static volatile boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (flag) {
                throw new RuntimeException("Singleton was initialized more than one time");
            }
            flag = true;
        }
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

}
