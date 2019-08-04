package spring.javaconfig.injectimportbeans;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SystemAppConfig.class })
public class InjectImportBeansTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Import_Bean_Inject() {
        TransferService transferService =
                applicationContext.getBean("transferService", TransferService.class);
        Assert.assertNotNull(transferService);

        Assert.assertNotNull(transferService.transfer());
    }
}