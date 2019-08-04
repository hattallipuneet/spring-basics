package spring.beans.methodinjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beans.methodinjection.Command;
import spring.xmlannotationconfig.beans.methodinjection.MethodInjectedCommandManager;
import spring.xmlannotationconfig.beans.methodinjection.SpringAwareCommandManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/method-injection-app-context.xml"})
public class MethodInjectionTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_SingletonBean_With_Prototype_Dependency() {
        SpringAwareCommandManager manager =
                applicationContext.getBean("commandManager", SpringAwareCommandManager.class);
        Command command1 = manager.getCommandToExecute();
        Command command2 = manager.getCommandToExecute();

        Assert.assertNotEquals(command1.hashCode(), command2.hashCode());
    }

    @Test
    public void test_Method_Lookup() {
        MethodInjectedCommandManager manager =
                applicationContext.getBean("miCommandManager", MethodInjectedCommandManager.class);
        Command command1 = manager.getCommandToExecute();
        Command command2 = manager.getCommandToExecute();
        Assert.assertNotEquals(command1.hashCode(), command2.hashCode());
        Assert.assertNotEquals("Default Command", command1.getCommand());
        Assert.assertNotEquals("Default Command", command2.getCommand());
    }
}
