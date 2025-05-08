package cloud.popples.designpattern.behavior.command;

import javax.naming.OperationNotSupportedException;

/**
 * @description: 命令类
 * @author: Mr.Han
 * @create: 2025-05-08 09:26
 */

public interface Command {

    void execute();

    void undo();

    default void delay() throws Exception {
        throw new OperationNotSupportedException();
    }

}
