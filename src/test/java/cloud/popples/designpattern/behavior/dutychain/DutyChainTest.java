package cloud.popples.designpattern.behavior.dutychain;

import org.junit.jupiter.api.Test;

/**
 * @description: 责任链模式测试类
 * @author: Mr.Han
 * @create: 2025-05-07 09:50
 */

public class DutyChainTest {

    @Test
    void testApproval() {
        Approval manager = new Manager(Approval.NUM_FIVE, null);
        Approval director = new Director(Approval.NUM_THREE, manager);
        Approval teamLeader = new TeamLeader(Approval.NUM_ONE, director);

        LeaveRequest leaveRequest1 = new LeaveRequest("Mike", 1, "illness");
        LeaveRequest leaveRequest2 = new LeaveRequest("Mike", 3, "illness");
        LeaveRequest leaveRequest3 = new LeaveRequest("Mike", 4, "illness");
        LeaveRequest leaveRequest4 = new LeaveRequest("Mike", 10, "illness");

        teamLeader.submit(leaveRequest1);
        teamLeader.submit(leaveRequest2);
        teamLeader.submit(leaveRequest3);
        teamLeader.submit(leaveRequest4);
    }

}
