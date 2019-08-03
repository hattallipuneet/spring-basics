package spring.javaconfig.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SecurityConfig {

    @Bean(name = "encryptor")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Encryptor encryptor() {
        return new Encryptor();
    }
}
