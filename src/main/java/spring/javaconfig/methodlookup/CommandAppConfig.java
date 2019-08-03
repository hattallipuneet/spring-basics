package spring.javaconfig.methodlookup;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CommandAppConfig {

    @Bean
    public CommandManager commandManager() {
        return new CommandManager() {
            @Override
            public Command createCommand() {
                return command();
            }
        };
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Command command() {
        return new Command();
    }

}
