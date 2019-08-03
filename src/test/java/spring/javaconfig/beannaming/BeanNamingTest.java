package spring.javaconfig.beannaming;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {DataLayerConfig.class})
public class BeanNamingTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Java_Config_BeanNaming() {

        Datasource defaultDatasource =
                applicationContext.getBean("default-data-source", Datasource.class);

        Assert.assertNotNull(defaultDatasource);

        Datasource systemDatasource =
                applicationContext.getBean("system-datasource", Datasource.class);

        Assert.assertNotNull(systemDatasource);

    }

}
