package cloud.popples.designpattern.behavior.command;

/**
 * @description: 取钱命令类
 * @author: Mr.Han
 * @create: 2025-05-08 09:35
 */

public class WithdrawCommand implements Command {

    private Account account;
    private int amount;

    public WithdrawCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void undo() {
        account.deposit(amount);
    }
}
