package spring.javaconfig.springprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class StandaloneDataConfig {

    @Bean(name = {"devDataSource"})
    public DataSource dataSource() {
        return new DataSource("DEV ENV");
    }
}
