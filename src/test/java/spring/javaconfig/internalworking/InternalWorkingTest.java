package spring.javaconfig.internalworking;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { InfraConfig.class })
public class InternalWorkingTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Internal_Working() {
        ClientServiceImpl defaultClientService =
                applicationContext.getBean("defaultClientService", ClientServiceImpl.class);

        ClientServiceImpl clientService =
                applicationContext.getBean("clientService", ClientServiceImpl.class);

        Assert.assertTrue(defaultClientService.getClientDao() ==
                clientService.getClientDao());
    }
}
