/**
 * The class in this package and their corresponding configuration metadata, properties files
 * demonstrate the use of BeanFactoryPostProcessor.
 *
 * What are BeanFactoryPostProcessor ?
 *  BFPP operate on bean configuration metadata. It allows to modify the bean configuration metadata
 *  before Spring IOC container starts instantiating, configuring and assembling the beans.
 *
 *  Some Examples of BFPP are :
 *      PropertyPlaceholderConfigurer
 *      PropertyOverrideConfigurer
 *
 *  Scope of operation BFPP :
 *      A BFPP can operate only on configuration that are part of container to which it belongs.
 *      It cannot operate on other configuration files in application context hierarchy.
 *
 *
 *  What is difference between PPC and POC ?
 *      1. PPC can replace placeholder with value resolved from properties file as specified.
 *         The placeholders are specified in format ${placeholder}
 *
 *      2. POC is useful when you want to override value of a property of a bean.
 *         The property values in properties file are expected to be in form :
 *
 *         beanName.property=value
 *
 *         e.g. dataSource.url=localhost:3300
 *
 *         <bean id="dataSource" class="">
 *              <property name="url" value="localhost:4200"/>
 *         </bean>
 *
 *
 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor
 * @see org.springframework.beans.factory.config.PropertyPlaceholderConfigurer
 * @see org.springframework.beans.factory.config.PropertyOverrideConfigurer
 * */

package spring.beanfactorypostprocessor;