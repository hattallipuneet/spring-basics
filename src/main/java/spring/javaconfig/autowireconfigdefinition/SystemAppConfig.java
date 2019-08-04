package spring.javaconfig.autowireconfigdefinition;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SystemAppConfig {

    @Autowired
    private RestInfraConfig restInfraConfig;

    @Bean
    public BookingService bookingService() {
        return new BookingServiceImpl(restInfraConfig.httpClient());
    }


}
