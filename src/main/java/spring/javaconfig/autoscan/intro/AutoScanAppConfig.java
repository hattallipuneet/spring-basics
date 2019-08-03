package spring.javaconfig.autoscan.intro;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.javaconfig"})
public class AutoScanAppConfig {
}
