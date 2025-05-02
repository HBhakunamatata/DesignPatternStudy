package cloud.popples.designpattern.creation.singleton.destroy;

import cloud.popples.designpattern.creation.singleton.demo03.LazySingleton;
import cloud.popples.designpattern.creation.singleton.demo04.Singleton;
import java.lang.reflect.Constructor;
import lombok.SneakyThrows;

/**
 * @description: 破坏单例模式：反射
 * @author: Mr.Han
 * @create: 2025-05-01 18:19
 */

public class Reflect {

//    public static void main(String[] args) {
//        Singleton s1 = reflect();
//        Singleton s2 = reflect();
//        System.out.println(s1 == s2);
//    }
//
//    @SneakyThrows
//    private static Singleton reflect() {
//        Class<Singleton> clazz = Singleton.class;
//        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        return constructor.newInstance();
//    }

//    public static void main(String[] args) {
//        LazySingleton s1 = reflect();
//        LazySingleton s2 = reflect();
//        System.out.println(s1 == s2);
//    }
//
//    @SneakyThrows
//    private static LazySingleton reflect() {
//        Class<LazySingleton> clazz = LazySingleton.class;
//        Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        return constructor.newInstance();
//    }

    public static void main(String[] args) {
        Singleton s1 = reflect();
        Singleton s2 = reflect();
        System.out.println(s1 == s2);
    }

    @SneakyThrows
    private static Singleton reflect() {
        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        return constructor.newInstance();
    }

}
