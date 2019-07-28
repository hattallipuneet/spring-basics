package spring.beans.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/bean-lifecycle.xml"})
public class BeanLifecycleTest {

    private @Autowired ApplicationContext applicationContext;

    @Test
    public void test_Bean_Life_Cycle() {
        System.out.println("Loading bean using the IOC");
        applicationContext.getBean("beanWithLifecycle", BeanWithLifeCycleCallbacks.class);
    }

}
