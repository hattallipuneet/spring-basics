/**
 * Autowiring collaborators in spring.
 *
 * Autowire is functionality of spring that allows for automatic resolution of object dependency
 * and inject them into the object during its creation.
 *
 * Spring supports following autowire modes :
 *
 * no : (DEFAULT) mode where autowire is not enabled for the bean. Dependencies need to injected
 *      explicitly.
 *
 * byName : Spring container injects the beans whose bean id match the property name of dependency.
 *
 * byType : Spring container will try to inject the beans whose reference type is same as the type of
 *          the dependency property.
 *
 * constructor : This same as byType mode, but it is applicable for constructor arguments. The spring container
 *              will try to find the beans whose reference type match the dependency property type.
 *
 *
 * Advantages of autowiring :
 *  1. It reduces the amount of configuration needed for bean definition.
 *  2. In case of XML based configuration, configuration gets updated automatically as objects evolve.
 *      there is no need to add new configuration explicitly.
 *
 *
 *  Limitations of autowiring :
 *   1. Primitives , String type cannot be autowired.
 *   2. Explicit dependency settings in form of setter injection or constructor injection will always override
 *      the autowire setting.
 *   3. In case of byType/constructor mode, the spring container relies on type information to find the
 *      dependency bean. If there are multiple beans of same type, container does not raise an error for collections
 *      type dependencies but will raise error for non-collection type dependencies.
 *   4. Wiring information may not be available for tools that generate documentation.
 *   5. Autowiring technique is less exact than the explicit injection settings.
 *      Although in case of injecting dependencies automatically, spring is careful to avoid guessing in case
 *      of ambiguity. The relationship between collaborating beans is no longer documented explicitly.
 *
 *
 * */
package spring.beans.autowire;