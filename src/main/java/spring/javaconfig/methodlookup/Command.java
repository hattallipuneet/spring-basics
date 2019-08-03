package spring.javaconfig.methodlookup;

public class Command {

    private CommandState commandState;

   public CommandState getCommandState() {
        return commandState;
   }

   public void setCommandState(CommandState commandState) {
       this.commandState = commandState;
   }

   public CommandResponse executeCommand() {
       return new CommandResponse(commandState, String.valueOf(hashCode()));
   }
}
