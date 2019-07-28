package spring.beans.methodinjection;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringAwareCommandManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public Command getCommandToExecute() {
        return createCommand();
    }

    private Command createCommand() {
        return this.applicationContext.getBean("simpleCommand", Command.class);
    }
}
