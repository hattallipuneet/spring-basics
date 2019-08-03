package spring.javaconfig.methodlookup;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommandAppConfig.class})
public class JavaConfigMethodLookUpTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Method_Injection() {
        CommandManager manager =
                applicationContext.getBean("commandManager", CommandManager.class);
        Assert.assertNotNull(manager);
        CommandResponse response1 =
                manager.processCommand(CommandState.START);

        CommandResponse response2 =
                manager.processCommand(CommandState.START);

        Assert.assertNotEquals(response1.getResponseStr(),
                response2.getResponseStr());
    }

}
