package cloud.popples.designpattern.creation.factory.coffee;

/**
 * @description: 拿铁咖啡
 * @author: Mr.Han
 * @create: 2025-05-02 09:50
 */

public class LatteCoffee implements Coffee {

    private String name;

    public LatteCoffee(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
