package spring.xmlannotationconfig.beans.autowire;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beans.autowire.AutowiredBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/autowire-bean-app-context.xml"})
public class AutowireBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Bean_Is_Autowired_ByName() {
        AutowiredBean autowiredBean =
                applicationContext.getBean("autowiredBeanByName", AutowiredBean.class);
        Assert.assertNotNull(autowiredBean);
        Assert.assertNotNull(autowiredBean.getDependencyBean());
        Assert.assertEquals("String value for DependencyBean", autowiredBean.getDependencyBean().getName());
    }

    @Test
    public void test_Bean_Is_Autowired_ByType() {
        AutowiredBean autowiredBean =
                applicationContext.getBean("autowireBeanByType", AutowiredBean.class);
        Assert.assertNotNull(autowiredBean);
        Assert.assertNotNull(autowiredBean.getDependencyBean());
        Assert.assertEquals("String value for DependencyBean", autowiredBean.getDependencyBean().getName());
    }
    @Test
    public void test_Bean_Is_Autowired_ByContructor() {
        AutowiredBean autowiredBean =
                applicationContext.getBean("autowireBeanByConstructor", AutowiredBean.class);
        Assert.assertNotNull(autowiredBean);
        Assert.assertNotNull(autowiredBean.getDependencyBean());
        Assert.assertEquals("String value for DependencyBean", autowiredBean.getDependencyBean().getName());
    }

}
