package cloud.popples.designpattern.creation.builder.bike;

/**
 * @description: 自行车座
 * @author: Mr.Han
 * @create: 2025-05-03 16:27
 */

public class Seat {

    private String material;

    public Seat(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return this.material;
    }
}
