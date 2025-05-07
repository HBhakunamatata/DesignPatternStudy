package cloud.popples.designpattern.structure.decorator;

/**
 * @description: 炒饭类
 * @author: Mr.Han
 * @create: 2025-05-04 15:36
 */

public class FriedRice extends MainFood {

    public FriedRice(String desc, float price) {
        super(desc, price);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
