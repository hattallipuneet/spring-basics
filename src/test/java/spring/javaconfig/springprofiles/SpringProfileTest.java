package spring.javaconfig.springprofiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {JndiDataConfig.class, StandaloneDataConfig.class} )
@ActiveProfiles({"dev"})
public class SpringProfileTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Only_Dev_Beans_Are_Registered() {
        DataSource dataSource =
                applicationContext.getBean("devDataSource", DataSource.class);
        Assert.assertNotNull(dataSource);
        Assert.assertEquals("DEV ENV", dataSource.getSourceString());
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void test_Prod_Beans_Are_Not_Registered() {
        DataSource dataSource =
                applicationContext.getBean("prodDataSource", DataSource.class);
    }
}
