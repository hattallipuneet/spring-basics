package spring.javaconfig.propertysourceconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:properties/app-config.properties")
public class PropertyAppConfig {

    @Autowired
    Environment environment;

    @Bean
    public TestBean testBean() {
        TestBean bean = new TestBean();
        bean.setBeanName(environment.getProperty("beanName"));
        return bean;
    }
}
