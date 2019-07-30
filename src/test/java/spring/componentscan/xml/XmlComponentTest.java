package spring.componentscan.xml;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/component-scan-config.xml"})
public class XmlComponentTest {

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test_Auto_Detect_ComponentsScan() {
        SimpleMovieLister lister =
                applicationContext.getBean("simpleMovieLister", SimpleMovieLister.class);
        Assert.assertNotNull(lister);

        Assert.assertEquals(3, lister.listMovies().size());
    }
}
