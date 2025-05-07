package cloud.popples.designpattern.behavior.dutychain;

/**
 * @description: 小组长
 * @author: Mr.Han
 * @create: 2025-05-07 09:35
 */

public class TeamLeader extends Approval {

    public TeamLeader(int limit, Approval nextApproval) {
        super(limit, nextApproval);
    }

    @Override
    public void approve(LeaveRequest leaveRequest) {
        // 批准的操作
        System.out.println(leaveRequest);
        System.out.println("Approval done by Team leader");
    }
}
