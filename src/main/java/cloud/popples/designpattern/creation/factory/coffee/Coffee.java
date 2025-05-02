package cloud.popples.designpattern.creation.factory.coffee;

/**
 * @description: 咖啡抽象类
 * @author: Mr.Han
 * @create: 2025-05-02 09:47
 */

public interface Coffee {

    public abstract String getName();

    default void addSugar() {
        System.out.println("add sugar ...");
    }

}
