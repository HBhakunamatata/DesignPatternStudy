package cloud.popples.designpattern.behavior.command;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @description: 命令模式测试类
 * @author: Mr.Han
 * @create: 2025-05-08 09:57
 */

public class CommandTest {

    private Account account;
    private CommandInvoker commandInvoker;

    @BeforeEach
    void before() {
        account = new Account(1000);
        commandInvoker = new CommandInvoker();
    }

    @Test
    void testWithdraw() {
        Command command = new WithdrawCommand(account, 200);
        commandInvoker.executeCommand(command);
        Assertions.assertEquals(800, account.getBalance());
    }

    @Test
    void testDeposit() {
        Command command = new DepositCommand(account, 200);
        commandInvoker.executeCommand(command);
        Assertions.assertEquals(1200, account.getBalance());
    }

    @Test
    void testUndoDeposit() {
        Command command = new DepositCommand(account, 200);
        commandInvoker.executeCommand(command);
        commandInvoker.undoLast();
        Assertions.assertEquals(1000, account.getBalance());
    }

    @Test
    void testUndoWithdraw() {
        Command command = new WithdrawCommand(account, 200);
        commandInvoker.executeCommand(command);
        commandInvoker.undoLast();
        Assertions.assertEquals(1000, account.getBalance());
    }

}
