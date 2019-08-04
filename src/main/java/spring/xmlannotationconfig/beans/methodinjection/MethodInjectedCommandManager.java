package spring.xmlannotationconfig.beans.methodinjection;

public class MethodInjectedCommandManager {

    public Command getCommandToExecute() {
        return createCommand();
    }

    public Command createCommand() {
        return new Command(){
            {
                setCommand("Default Command");
            }
        };
    }
}
