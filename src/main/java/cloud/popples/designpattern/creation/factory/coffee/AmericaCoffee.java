package cloud.popples.designpattern.creation.factory.coffee;

/**
 * @description: 美式咖啡
 * @author: Mr.Han
 * @create: 2025-05-02 10:11
 */

public class AmericaCoffee implements Coffee {

    private String name;

    public AmericaCoffee() {}

    public AmericaCoffee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
