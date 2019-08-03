package spring.javaconfig.autoscan.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"spring.javaconfig"})
public class AutoScanAppConfig {
}
