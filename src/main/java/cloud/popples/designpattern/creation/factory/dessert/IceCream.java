package cloud.popples.designpattern.creation.factory.dessert;

/**
 * @description: 冰淇凌实现类
 * @author: Mr.Han
 * @create: 2025-05-02 13:41
 */

public class IceCream implements Dessert{

    private final String name;

    public IceCream(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
