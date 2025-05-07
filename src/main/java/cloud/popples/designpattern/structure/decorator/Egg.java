package cloud.popples.designpattern.structure.decorator;

/**
 * @description: 搭配：鸡蛋类
 * @author: Mr.Han
 * @create: 2025-05-04 15:40
 */

public class Egg extends AddedFood {

    protected Egg(MainFood mainFood, String desc, float price) {
        super(mainFood, desc, price);
    }

    @Override
    public float cost() {
        return getMainFood().cost() + getPrice();
    }
}
