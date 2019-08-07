package spring.javaconfig.springprofilesmetaannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@Development
public class DevConfig {

    @Bean
    public Properties devProperties() {
        Properties properties = new Properties();
        properties.setProperty("key", "local_dev_properties");
        return properties;
    }
}
