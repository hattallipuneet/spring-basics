package spring.javaconfig.autowireconfigdefinition;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SystemAppConfig.class, RestInfraConfig.class})
public class AutowireConfigBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Config_Definition_Autowire() {
        BookingService bookingService =
                applicationContext.getBean("bookingService", BookingService.class);

        Assert.assertNotNull(bookingService);
        Assert.assertNotNull(bookingService.getBookingId());
    }
}
