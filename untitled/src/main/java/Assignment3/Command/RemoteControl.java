package Assignment3.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String action, Command command) {
        commands.put(action, command);
    }

    public void buttonPressed(String action) {
        Command command = commands.get(action);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Неизвестная команда.");
        }
    }
}
