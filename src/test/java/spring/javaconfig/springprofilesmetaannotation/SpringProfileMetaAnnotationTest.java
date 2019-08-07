package spring.javaconfig.springprofilesmetaannotation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DevConfig.class, ProdConfig.class })
@ActiveProfiles({"production"})
public class SpringProfileMetaAnnotationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Only_Prod_Beans_Are_Registered() {
        Properties properties =
                applicationContext.getBean("productionProperties", Properties.class);
        Assert.assertNotNull(properties);
        Assert.assertEquals("prod_properties", properties.getProperty("key"));
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void test_Dev_Beans_Are_Not_Registered() {
        Properties properties =
                applicationContext.getBean("devProperties", Properties.class);
    }
}
