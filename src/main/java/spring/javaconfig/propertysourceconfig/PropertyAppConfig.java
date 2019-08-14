package spring.javaconfig.propertysourceconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:properties/app-config.properties")
public class PropertyAppConfig {

    @Value("${property_1}")
    private String property;

    @Value("${property_2:default}")
    private String propertyWithDefault;

    @Autowired
    private Environment environment;

    public String getProperty() {
        return property;
    }

    public String getPropertyWithDefault() {
        return propertyWithDefault;
    }

    @Bean
    public TestBean testBean() {
        TestBean bean = new TestBean();
        bean.setBeanName(environment.getProperty("beanName"));
        return bean;
    }
}
