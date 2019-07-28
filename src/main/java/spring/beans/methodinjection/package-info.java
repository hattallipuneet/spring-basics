/**
 * Scenario where this might be useful.
 *
 *  In most cases the beans in spring are mostly singletons.
 *  When a singleton bean needs to collaborate with another singleton or a non-singleton bean needs
 *  to collaborate with another non-singleton bean, the dependencies are declared as properties of the bean.
 *
 *  Problems could arise when the lifecycle of the collaborating beans are different.
 *
 *  For e.g. a singleton bean has a non-singleton bean as a dependency and might need a new instance of non-singleton
 *  bean for operations.
 *
 *  Since the singleton beans are instantiated and assembled only once, the lifecycle of any non-singleton
 *  bean is same the enclosing singleton bean. The container cannot provide the singleton bean with a new
 *  non-singleton bean instance everytime it is needed.
 *
 *  Following are the solution to this problem :
 *
 *  1. Make the bean spring aware. (Involves bean class implement the ApplicationContextAware interface)
 *      The bean gets tightly coupled to spring technology.
 *  2. Use method lookup technique.
 *      Spring provides a way to define configuration that allows for method of a bean to be overridden at runtime
 *      and implements its own method.
 *
 *      <bean id="someCommand" class="com.command.SomeCommand"/>
 *
 *      <bean id="commandManager" class="com.command.manager.SpringAwareCommandManager">
 *          <lookup method="createCommand" ref/>
 *      </bean>
 *
 *
 *
* */
package spring.beans.methodinjection;