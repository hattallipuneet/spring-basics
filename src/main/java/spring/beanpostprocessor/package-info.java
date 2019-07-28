/**
 * Examples in this package illustrate the {@link org.springframework.beans.factory.config.BeanPostProcessor}
 * container extension points.
 *
 * BeanPostProcessor interface defines call back methods that allow to provide custom :
 *  1. Instantiation logic
 *  2. Dependency resolution logic.
 *
 *  When does BeanPostProcessors get executed ?
 *      The BeanPostProcessors are executed after the Spring IOC container instantiates, configures,
 *      initializes the bean.
 *
 * What is the purpose BeanPostProcessors ?
 *  If you want to provide custom initialization logic, dependency resolution logic after the
 *  the spring IOC container finishes instantiating, configuring, initializing the bean, you can plugin one
 *  or more BeanPostProcessor implementations.
 *
 *
 * Beans of type {@link org.springframework.beans.factory.config.BeanPostProcessor} are detected and instantiated
 * by the IOC container even before any of the other beans are created.
 *
 *
 * The {@link org.springframework.beans.factory.config.BeanPostProcessor} operate on the spring beans created by the
 * IOC container.
 *
 * A BeanPostProcessor can only operate on beans within the same Spring container. It cannot operate on beans
 * that are from different containers.
 *
 *
 *
 * Methods defined in {@link org.springframework.beans.factory.config.BeanPostProcessor}
 *  1. postProcessAfterInitialization(java.lang.Object, java.lang.String)}
 *      This method gets invoked after InitializingBean's afterPropertiesSet() method or any of the custom
 *      init-method is executed.
 *
 *  2. postProcessBeforeInitialization(java.lang.Object, java.lang.String)}
 *      This method is executed before InitializingBean's afterPropertiesSet() method or any of the custom
 *      init-method is executed.
 *
 *
 *
 *
 * @see org.springframework.beans.factory.config.BeanPostProcessor
 *
 * */

package spring.beanpostprocessor;