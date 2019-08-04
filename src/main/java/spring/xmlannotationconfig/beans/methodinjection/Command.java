package spring.xmlannotationconfig.beans.methodinjection;

public class Command {

    private String command;

    public String execute() {
        return command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
