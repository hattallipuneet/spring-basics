/**
* Classes in this package demonstrate the dependsOn feature of spring core bean initialization.
*
* Usually to define the dependency of a bean, the dependencies are expressed as properties of the bean class
* definition.
*
* In some cases where beans have indirect dependency like the DB Driver need to be initialized before any
* of the other need to perform DB operations.
*
* In such we can define the indirect dependency between the beans using the dependsOn attribute.
*
*   <bean id="beanOne" class="ExampleBean" depends-on="manager,accountDao">
*       <!-- The dependsOn attribute above defines an indirect dependency with the manager and accountDao bean -->
*       <property name="manager" ref="manager"/>
*   </bean>
*
*   <bean id="manager" class="ManagerBean" />
*
*   <bean id="accountDao" class="x.y.z.JdbcAccountDao"/>
*
* */
package spring.xmlannotationconfig.beans.dependson;