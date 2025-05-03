package cloud.popples.designpattern.creation.builder;

import cloud.popples.designpattern.creation.builder.bike.Bike;

/**
 * @description: 自行车建设者接口
 * @author: Mr.Han
 * @create: 2025-05-03 16:31
 */

public abstract class BikeBuilder {

    protected Bike bike = new Bike();

    abstract protected void addSeat();

    abstract protected void addFrame();

    public Bike createBike() {
        addFrame();
        addSeat();
        return bike;
    }

}
