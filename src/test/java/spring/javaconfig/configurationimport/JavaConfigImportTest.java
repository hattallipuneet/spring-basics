package spring.javaconfig.configurationimport;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = { RootConfig.class })
public class JavaConfigImportTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Config_Import() {
        ChildSpecificBean childSpecificBean =
                applicationContext.getBean("childSpecificBean", ChildSpecificBean.class);
        Assert.assertNotNull(childSpecificBean);

        RootSpecificBean rootSpecificBean =
                 applicationContext.getBean("rootSpecificBean", RootSpecificBean.class);

        Assert.assertNotNull(rootSpecificBean);
    }
}
