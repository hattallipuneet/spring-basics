package spring.javaconfig.autowireconfigdefinition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestInfraConfig {

    @Bean
    public HttpClient httpClient() {
        return new HttpClientImpl();
    }

}
