package cloud.popples.designpattern.behavior.dutychain;

/**
 * @description: 总监类
 * @author: Mr.Han
 * @create: 2025-05-07 09:51
 */

public class Director extends Approval{

    public Director(int limit, Approval nextApproval) {
        super(limit, nextApproval);
    }

    @Override
    public void approve(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest);
        System.out.println("Approval done by Director");
    }
}
