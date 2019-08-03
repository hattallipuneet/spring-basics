package spring.javaconfig.beanscope;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {spring.javaconfig.beanscope.SecurityConfig.class})
public class BeanScopeTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_Prototype_BeanScope() {
        GenericApplicationContext context =
                (GenericApplicationContext) applicationContext;
        BeanDefinition definition =
                context.getBeanDefinition("encryptor");
        Assert.assertNotNull(definition);
        Assert.assertTrue(ConfigurableBeanFactory.SCOPE_PROTOTYPE.equalsIgnoreCase(definition.getScope()));

        Encryptor aesEncryptor = applicationContext.getBean("encryptor", Encryptor.class);
        Encryptor desEncryptor = applicationContext.getBean("encryptor", Encryptor.class);

        Assert.assertNotEquals(aesEncryptor.hashCode(), desEncryptor.hashCode());
    }
}
