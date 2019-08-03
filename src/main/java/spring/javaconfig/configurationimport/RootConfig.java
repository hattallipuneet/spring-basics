package spring.javaconfig.configurationimport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ChildConfig.class })
public class RootConfig {

    @Bean
    public RootSpecificBean rootSpecificBean() {
        return new RootSpecificBean();
    }
}
