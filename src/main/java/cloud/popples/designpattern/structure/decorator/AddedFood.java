package cloud.popples.designpattern.structure.decorator;

/**
 * @description: 搭配
 * @author: Mr.Han
 * @create: 2025-05-04 15:14
 */

public abstract class AddedFood extends MainFood {

    private MainFood mainFood;

    protected AddedFood(MainFood mainFood, String desc, float price) {
        super(desc, price);
        this.mainFood = mainFood;
    }

    protected MainFood getMainFood() {
        return mainFood;
    }

}
