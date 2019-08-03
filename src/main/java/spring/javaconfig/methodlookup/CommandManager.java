package spring.javaconfig.methodlookup;

public abstract class CommandManager {

    public CommandResponse processCommand(CommandState commandState) {
        Command command = createCommand();
        command.setCommandState(CommandState.START);
        return command.executeCommand();
    }

    public abstract Command createCommand();
}
