/**
 * Classes to demonstrate concept of beans in spring.
 * An application is made of number of objects that collaborate to deliver a functionality.
 * These objects are the backbone of the application and are referred to as beans in spring framework.
 *
 * The class definitions in this package are used to demonstrate :
 * 1. How to define beans in XML based spring configuration ?
 *      Using <bean></bean> xml tag
 *
 * 2. Dependency injection techniques supported by spring for XML based configuration
 *   a.  Constructor Injection Technique.
 *      i. Using the name, ref attribute combination to define the reference type dependency
 *          <constructor-arg name="varName" ref="anotherBeanId"/>
 *      ii. Using the name, value attribute combination to define the scalar type dependency.
 *          <constructor-arg name="varName" value="{scalarValue}"/>
 *      iii. In case the constructor has a single reference type param, the name value can be skipped.
 *          <constructor-arg ref="anotherBeanId"/>
 *      iv. Using the index attribute to define dependency.
 *          <constructor-arg ref="anotherBeanId" index="{index_value}"/>
 *      v. Using the c-namespace shortcut technique.
 *         This involves adding the namespace url to allow usage of c-namespace in bean configuration.
 *              1. Using c-namespace with variable name: c:{param}[-ref]
 *                  <bean id="beanId" class="FQCN" c:varName-ref="anotherBeanId" c:varName="scalarValue"/>
 *              2. Using the c-namespace with index value: c:_{index}[-ref]
 *                  <bean id="beanId" class="FQCN" c:_0-ref="anotherBeanId" c:_1="scalarValue"/>
 *      Note: The point i, ii and iv above are useful in cases where constructor has params of same type.
 *
 *   b.  Setter Injection Technique
 *      i. Using the name, ref attribute to set the reference type property
 *          <property name="varName" ref="anotherBeanId"/>
 *     ii. Using the name, value attribute to set the scalar type property
 *          <property name="varName" value="scalarValue"/>
 *     iii. Using the p-namespace shortcut technique.
 *          This involves adding the namespace url to allow usage of p-namespace in configurations
 *              1. Using the p-namespace with variable name.
 *                  <bean id="beanId" class="FQCN" p:varName-ref="anotherBeanId" p:varName="scalarValue"/>
 *
 *
 * When to use CI and SI ?
 *
 * CI usage :
 *  When properties of the instance are mandatory.
 *
 * SI usage :
 *  When the properties of instance are optinal and can be set using the setter injection.
 *
 *  {@link spring.xmlannotationconfig.basics.beans.ComplexBean} class definition demonstrates the constructor dependency technique.
 *  It has two dependencies one is a reference type and another is primitive type.
 *
 *
 * {@link spring.xmlannotationconfig.basics.beans.ScalarValueBean} class definition demonstrates the setter dependency injection technique.
 * All of its dependencies are scalar type (primitive type).
 *
 * @author phattall
 * @version 1.0
 * @see spring.xmlannotationconfig.basics.beans.ComplexBean
 * @see spring.xmlannotationconfig.basics.beans.ScalarValueBean
 *
 * */
package spring.xmlannotationconfig.basics.beans;
