package spring.beanfactorypostprocessor;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/propertyplaceholder.xml"})
public class PropertyPlaceHolderTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_PropertiesLoad() {
        AppConfig appConfig =
                applicationContext.getBean("appConfig", AppConfig.class);
        Assert.assertNotNull(appConfig);

        Assert.assertEquals("/testapp/", appConfig.getAppurl());
        Assert.assertEquals("http://localhost:", appConfig.getUrl());
        Assert.assertEquals("4200", appConfig.getPort());
        Assert.assertEquals("default", appConfig.getUsername());
        Assert.assertEquals("default", appConfig.getPassword());
        System.out.println(appConfig.getOsName());


    }
}
