package cloud.popples.designpattern.creation.builder;

import cloud.popples.designpattern.creation.builder.bike.Bike;

/**
 * @description: 指挥者类
 * @author: Mr.Han
 * @create: 2025-05-03 16:41
 */

public class Director {

    private final BikeBuilder bikeBuilder;

    public Director(BikeBuilder bikeBuilder) {
        this.bikeBuilder = bikeBuilder;
    }

    public Bike construct() {
        return bikeBuilder.createBike();
    }

}
