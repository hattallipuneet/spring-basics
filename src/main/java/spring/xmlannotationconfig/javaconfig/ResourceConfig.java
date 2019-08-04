package spring.xmlannotationconfig.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public Repository jdbcRepository() {
        return new JdbcRepository(dataSource);
    }

}
