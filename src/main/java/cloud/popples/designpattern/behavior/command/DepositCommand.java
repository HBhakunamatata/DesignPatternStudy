package cloud.popples.designpattern.behavior.command;

/**
 * @description: 存钱命令类
 * @author: Mr.Han
 * @create: 2025-05-08 09:53
 */

public class DepositCommand implements Command {

    private Account account;
    private int amount;

    public DepositCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void undo() {
        account.withdraw(amount);
    }
}
