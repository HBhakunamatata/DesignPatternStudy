package cloud.popples.designpattern.structure.facade;

/**
 * @description: 电视
 * @author: Mr.Han
 * @create: 2025-05-05 09:48
 */

public class Tv implements ElectricalAppliances{

    private boolean status = false;

    @Override
    public void on() {
        status = true;
    }

    @Override
    public void off() {
        status = false;
    }

    @Override
    public String getStatus() {
        return status ? "ON" : "OFF";
    }
}
