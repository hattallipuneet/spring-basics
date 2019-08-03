package spring.javaconfig.beannaming;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLayerConfig {

    @Bean(name = {"default-data-source", "system-datasource"})
    public Datasource datasource() {
        return new Datasource();
    }

}
