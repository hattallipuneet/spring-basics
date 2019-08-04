package spring.xmlannotationconfig.beanpostprocessor;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beanpostprocessor.BeanNeedsValidation;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/bean-post-processor.xml"})
public class BeanPostProcessorTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_BeanPostProcessor() {
        BeanNeedsValidation beanNeedsValidation =
                applicationContext.getBean("beanNeedsValidation", BeanNeedsValidation.class);
        Assert.assertFalse(beanNeedsValidation.isInitialized());
    }
}
