package spring.beans.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanWithLifeCycleCallbacks implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("Providing bean with its context bean name");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Making bean context aware");
    }

    @PostConstruct
    public void initPostConstruct() {
        System.out.println("Annotated method init callback");
    }

    @PreDestroy
    public void closePreDestory() {
        System.out.println("Annotated method destroy callback");
    }

    public void defaultInit() {
        System.out.println("XML configured init method");
    }

    public void defaultClose() {
        System.out.println("XML configured destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface implemented init method callback");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Interface implemented destroy method callback");
    }
}
