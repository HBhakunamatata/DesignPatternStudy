package cloud.popples.designpattern.creation.singleton.demo02;

/**
 * @description: 饿汉单例-枚举实现-线程安全
 *       在不考虑内存消耗的情况下，极力推荐的饿汉式单例实现方式
 *
 *       天然防止单例破坏
 *          - 反射：construct遇到Enum类型自动抛异常
 *          - 反序列化：每个枚举对象都有一个唯一的 name 属性，序列化只是将 name 属性序列化 在反序列化的时候，通过values() 方法 获取 Map(key,value) 存储 name 和与之对应的对象之间的映射，然后通过 name 就可以直接获得原来的 Enum 对象，而不会创建一个新对象！也就是说反序列化 Enum  类对象拿到的仍然是原来的对象，这样就使得 Enum 类型实现了单例模式下的序列化安全
 * @author: Mr.Han
 * @create: 2025-05-01 15:24
 */

public enum Singleton {

    INSTANCE
    ;
}
