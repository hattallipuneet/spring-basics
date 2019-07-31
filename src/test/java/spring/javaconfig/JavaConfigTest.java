package spring.javaconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {spring.javaconfig.AppConfig.class})
public class JavaConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Application_Context_Type() {
        GenericApplicationContext context =
                (GenericApplicationContext) applicationContext;
        SimpleService simpleService =
                applicationContext.getBean("simpleService", SimpleService.class);
        System.out.println(simpleService.getClass().getSimpleName());
        Assert.assertNotNull(simpleService);
        System.out.println(context.getBeanDefinition("simpleService"));

    }

}
