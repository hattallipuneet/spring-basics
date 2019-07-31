package spring.javaconfig.beanlifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
        spring.javaconfig.beanlifecycle.BeanLifeCycleAppConfig.class
})
public class BeanLifeCycleAppConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Java_Config_Bean_Lifecycle() {
        Connector connector =
                applicationContext.getBean("connector", Connector.class);
        
    }
}
