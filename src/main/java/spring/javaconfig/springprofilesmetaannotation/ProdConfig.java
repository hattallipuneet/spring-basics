package spring.javaconfig.springprofilesmetaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@Production
public class ProdConfig {

    @Bean(name = "productionProperties")
    public Properties properties() {
        Properties properties = new Properties();
        properties.setProperty("key", "prod_properties");
        return properties;
    }
}
