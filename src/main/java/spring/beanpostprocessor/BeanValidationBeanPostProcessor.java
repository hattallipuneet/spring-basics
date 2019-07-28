package spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanValidationBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanNeedsValidation) {
            System.out.println(beanName+ " needs validation ");
            BeanNeedsValidation beanNeedsValidation =
                    ((BeanNeedsValidation) bean);
            beanNeedsValidation.validateState();
            beanNeedsValidation.setInitialized(false);
        }else {
            System.out.println("Skipping validation for bean "+beanName);
        }
        return bean;
    }
}
