package cloud.popples.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 命令触发者
 * @author: Mr.Han
 * @create: 2025-05-08 09:26
 */

public class CommandInvoker {

    private List<Command> commands;

    public CommandInvoker() {
        commands = new ArrayList<>();
    }

    public void undoLast() {
        if (!commands.isEmpty()) {
            commands.get(commands.size() - 1).undo();
        } else {
            System.out.println("No command executed");
        }
    }

    public void executeCommand(Command command) {
        command.execute();
        commands.add(command);
    }

}
