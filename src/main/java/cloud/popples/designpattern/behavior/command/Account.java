package cloud.popples.designpattern.behavior.command;

import java.math.BigDecimal;

/**
 * @description: 银行账户类
 * @author: Mr.Han
 * @create: 2025-05-08 09:10
 */

public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    /**
     * 取钱
     * @param amount
     */
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount is larger than the account balance!");
        }
        printBalance();
    }

    /**
     * 存钱
     * @param amount
     */
    public void deposit(int amount) {
        balance += amount;
        printBalance();
    }

    private void printBalance() {
        System.out.println("The balance is " + balance);
    }

}
