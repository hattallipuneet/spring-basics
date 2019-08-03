package spring.javaconfig.methodlookup;

public class CommandResponse {
    private CommandState commandState;
    private String responseStr;

    public CommandResponse(CommandState commandState, String responseStr) {
        this.commandState = commandState;
        this.responseStr = responseStr;
    }

    public CommandState getCommandState() {
        return commandState;
    }

    public String getResponseStr() {
        return responseStr;
    }

    public void setCommandState(CommandState commandState) {
        this.commandState = commandState;
    }

    public void setResponseStr(String responseStr) {
        this.responseStr = responseStr;
    }
}
