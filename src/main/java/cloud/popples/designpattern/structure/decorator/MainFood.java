package cloud.popples.designpattern.structure.decorator;

/**
 * @description: 主食接口
 * @author: Mr.Han
 * @create: 2025-05-04 15:09
 */

public abstract class MainFood {

    private String desc;

    private float price;

    protected MainFood(String desc, float price) {
        this.desc = desc;
        this.price = price;
    }

    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public float getPrice() {
        return price;
    }

}
