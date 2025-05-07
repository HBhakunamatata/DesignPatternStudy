package cloud.popples.designpattern.creation.builder;

import cloud.popples.designpattern.creation.builder.bike.Frame;
import cloud.popples.designpattern.creation.builder.bike.Seat;

/**
 * @description: OFO自行车建设类
 * @author: Mr.Han
 * @create: 2025-05-03 16:35
 */

public class OfoBikeBuilder extends BikeBuilder {

    @Override
    protected void addSeat() {
        Seat feather = new Seat("feather");
        bike.setSeat(feather);
    }

    @Override
    protected void addFrame() {
        Frame frame = new Frame("Al");
        bike.setFrame(frame);
    }
}
