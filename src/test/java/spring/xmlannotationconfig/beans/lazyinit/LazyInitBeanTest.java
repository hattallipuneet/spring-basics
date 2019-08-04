package spring.xmlannotationconfig.beans.lazyinit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/lazy-init.xml"})
public class LazyInitBeanTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_LazyBean_Is_Not_Loaded() {
        GenericApplicationContext context =
                (GenericApplicationContext) applicationContext;
    }
}
