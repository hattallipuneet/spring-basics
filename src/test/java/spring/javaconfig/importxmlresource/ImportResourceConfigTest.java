package spring.javaconfig.importxmlresource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class ImportResourceConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Test
    public void test_Xml_Resource_Import() {
        DataSource dataSource =
                applicationContext.getBean("dataSource", DataSource.class);
        Assert.assertNotNull(dataSource);
        String expected =
                String.format("[ URL PROPS { %s %s %s }  ]", this.url, this.username, this.password);
        Assert.assertEquals(expected, dataSource.toString());
    }
}
