package spring.javaconfig.configurationimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildConfig {

    @Bean
    public ChildSpecificBean childSpecificBean () {
        return new ChildSpecificBean();
    }
}
