package spring.beans.servicelocator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beans.servicelocator.UserResource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/service-locator.xml"})
public class ServiceLocatorTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Service_Bean_Locating_Capability() {
        UserResource resource = applicationContext.getBean("userResource", UserResource.class);
        Assert.assertNotNull(resource);
        Assert.assertEquals("Request Processed", resource.handleRequest());
    }

}
