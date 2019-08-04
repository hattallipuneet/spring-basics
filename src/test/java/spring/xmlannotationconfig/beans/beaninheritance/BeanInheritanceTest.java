package spring.xmlannotationconfig.beans.beaninheritance;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beans.beaninheritance.DevEnvironmentAttr;
import spring.xmlannotationconfig.beans.beaninheritance.ProdEnvironmentAttr;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/bean-inheritance.xml"})
public class BeanInheritanceTest {

    private @Autowired ApplicationContext applicationContext;

    @Test
    public void test_Bean_Inheritance() {
        DevEnvironmentAttr devEnvironmentAttr =
                applicationContext.getBean("devEnvironmentAttr", DevEnvironmentAttr.class);
        ProdEnvironmentAttr prodEnvironmentAttr =
                applicationContext.getBean("prodEnvironment", ProdEnvironmentAttr.class);

        Assert.assertEquals("DEV", devEnvironmentAttr.getAppMode());
        Assert.assertEquals("PROD", prodEnvironmentAttr.getAppMode());
        Assert.assertEquals("DEV_USER", devEnvironmentAttr.getUsername());
        Assert.assertEquals("PROD_USER", prodEnvironmentAttr.getUsername());
    }
}
