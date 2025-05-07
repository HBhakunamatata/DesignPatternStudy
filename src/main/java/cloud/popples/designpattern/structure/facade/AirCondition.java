package cloud.popples.designpattern.structure.facade;

/**
 * @description: 空调
 * @author: Mr.Han
 * @create: 2025-05-05 09:46
 */

public class AirCondition implements ElectricalAppliances{

    private boolean status;

    public AirCondition() {
        this.status = false;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public String getStatus() {
        return status ? "ON" : "OFF";
    }
}
