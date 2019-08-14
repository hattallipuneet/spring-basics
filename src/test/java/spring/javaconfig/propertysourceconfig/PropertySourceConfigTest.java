package spring.javaconfig.propertysourceconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PropertyAppConfig.class })
public class PropertySourceConfigTest {

    @Autowired
    private PropertyAppConfig appConfig;

    @Autowired
    private TestBean testBean;

    @Test
    public void testPropertySource() {
        Assert.assertNotNull(testBean);
        Assert.assertEquals("testBean", testBean.getBeanName());
    }

    @Test
    public void testPropertyInjectionFromPropertySource() {
        Assert.assertNotNull(appConfig.getProperty());
        Assert.assertEquals("from_properties_file", appConfig.getProperty());

        Assert.assertNotNull(appConfig.getPropertyWithDefault());
        Assert.assertEquals("default", appConfig.getPropertyWithDefault());
    }
}
