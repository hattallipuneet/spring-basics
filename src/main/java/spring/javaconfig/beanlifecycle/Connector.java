package spring.javaconfig.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.*;

@Component("connector")
public class Connector implements InitializingBean, DisposableBean {

    private Map<String, String> connectorProperties;

    @Override
    public void afterPropertiesSet() throws Exception {
        connectorProperties.put("username", "default");
        listConnectorProperties();
    }

    @PostConstruct
    public void initialize() throws Exception {
        connectorProperties = new LinkedHashMap<>();
        connectorProperties.put("url", "http://localhost:8080/init");
        listConnectorProperties();
    }

    public void initBean() throws Exception {
        connectorProperties.put("password", "default");
        listConnectorProperties();
    }

    @Override
    public void destroy() throws Exception {
        listConnectorProperties();
        connectorProperties.remove("username");
    }

    @PreDestroy
    public void close() throws Exception {
        listConnectorProperties();
        connectorProperties.remove("url");
    }

    public void tearDown() throws Exception {
        listConnectorProperties();
        connectorProperties.remove("password");
    }

    private void listConnectorProperties() {
        connectorProperties.forEach((k,v) -> {
            System.out.printf("%s-%s", k, v);
            System.out.println();
        });
    }
}
