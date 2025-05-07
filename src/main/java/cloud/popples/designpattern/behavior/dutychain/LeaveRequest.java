package cloud.popples.designpattern.behavior.dutychain;

import lombok.Getter;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-05-07 09:28
 */

@Getter
public class LeaveRequest {

    private final String name;

    private final int days;

    private final String excuse;

    public LeaveRequest(String name, int days, String excuse) {
        this.name = name;
        this.days = days;
        this.excuse = excuse;
    }

    @Override
    public String toString() {
        return "LeaveRequest [" + name + " needs " + days + " leaves, " + excuse + "]";
    }
}
