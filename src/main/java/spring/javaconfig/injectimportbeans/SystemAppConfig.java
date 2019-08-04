package spring.javaconfig.injectimportbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ RepositoryConfig.class, ServiceConfig.class })
public class SystemAppConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSource();
    }

}