package spring.xmlannotationconfig.javaconfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/xml-centric-configuration.xml"})
public class XmlJavaConfigDeclarationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Xml_Java_Config_Declaration_Test() {
        Repository repository =
                applicationContext.getBean("jdbcRepository", Repository.class);
        Assert.assertNotNull(repository);
        Assert.assertNotNull(repository.save());
    }

}