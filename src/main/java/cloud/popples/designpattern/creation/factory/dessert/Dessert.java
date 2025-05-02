package cloud.popples.designpattern.creation.factory.dessert;

/**
 * @description: 甜品接口
 * @author: Mr.Han
 * @create: 2025-05-02 13:35
 */

public interface Dessert {

    String getName();

    default void eat() {
        System.out.println("eating " + this.getName());
    }

}
