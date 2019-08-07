package spring.javaconfig.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class JndiDataConfig {

    @Bean(name = {"prodDataSource"})
    public DataSource dataSource() {
        return new DataSource("PROD DEV");
    }
}
