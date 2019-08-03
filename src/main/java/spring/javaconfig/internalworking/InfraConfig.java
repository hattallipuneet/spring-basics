package spring.javaconfig.internalworking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfraConfig {

    @Bean
    public ClientServiceImpl defaultClientService() {
        ClientServiceImpl clientService =
                new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }

    @Bean
    public ClientServiceImpl clientService() {
        ClientServiceImpl clientService =
                new ClientServiceImpl();
        clientService.setClientDao(clientDao());
        return clientService;
    }

    @Bean
    public ClientDao clientDao() {
        return new ClientDao();
    }

}
