package spring.beans.dependson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.xmlannotationconfig.beans.dependson.Dependency;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/beans-dependson.xml"})
public class IndirectBeanDependencyTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Bean_Indirect_Dependency_Initialization() {
        Assert.assertEquals("This was initialized", Dependency.getInitializedValue());
    }
}
