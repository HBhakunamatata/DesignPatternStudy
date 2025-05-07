package cloud.popples.designpattern.creation.builder.bike;

/**
 * @description: 车架类
 * @author: Mr.Han
 * @create: 2025-05-03 16:26
 */

public class Frame {

    private String material;

    public Frame(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return this.material;
    }
}
