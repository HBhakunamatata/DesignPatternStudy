package cloud.popples.designpattern.behavior.dutychain;

/**
 * @description: 总经理类
 * @author: Mr.Han
 * @create: 2025-05-07 09:40
 */

public class Manager extends Approval{

    public Manager(int limit, Approval nextApproval) {
        super(limit, nextApproval);
    }

    @Override
    public void approve(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest);
        System.out.println("Approval done by Ma"
            + "nager");
    }
}
