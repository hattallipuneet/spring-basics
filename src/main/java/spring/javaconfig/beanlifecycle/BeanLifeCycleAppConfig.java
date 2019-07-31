package spring.javaconfig.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.javaconfig.beanlifecycle"})
public class BeanLifeCycleAppConfig {

    @Bean(initMethod = "initBean", destroyMethod = "tearDown")
    public Connector connector() {
        return new Connector();
    }
}
