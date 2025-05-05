package cloud.popples.designpattern.structure.facade;

/**
 * @description: 电器接口
 * @author: Mr.Han
 * @create: 2025-05-05 09:46
 */

public interface ElectricalAppliances {

    void on();

    void off();

    String getStatus();

}
