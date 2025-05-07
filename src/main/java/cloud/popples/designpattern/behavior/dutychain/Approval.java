package cloud.popples.designpattern.behavior.dutychain;

/**
 * @description: 审批者
 * @author: Mr.Han
 * @create: 2025-05-07 09:23
 */

public abstract class Approval {

    public static final int NUM_ONE = 1;
    public static final int NUM_THREE = 3;
    public static final int NUM_FIVE = 5;

    private int limit;
    private Approval nextApproval;

    protected Approval(int limit, Approval nextApproval){
        this.nextApproval = nextApproval;
        this.limit = limit;
    }

    public final void submit(LeaveRequest leaveRequest) {
        if (leaveRequest.getDays() <= limit) {
            approve(leaveRequest);
        } else if (nextApproval == null) {
            return;
        } else {
            nextApproval.submit(leaveRequest);
        }
    }

    protected abstract void approve(LeaveRequest leaveRequest);

}
