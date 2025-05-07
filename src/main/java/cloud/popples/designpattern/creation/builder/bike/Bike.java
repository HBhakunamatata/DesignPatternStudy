package cloud.popples.designpattern.creation.builder.bike;

/**
 * @description: 自行车类
 * @author: Mr.Han
 * @create: 2025-05-03 16:26
 */

public class Bike {

    private Frame frame;

    private Seat seat;

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String show() {
        return "There is a bike. It has "
            + frame + " frame and "
            + seat + " seat\n";
    }

}
