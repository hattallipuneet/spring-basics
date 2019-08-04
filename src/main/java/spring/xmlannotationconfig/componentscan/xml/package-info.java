/**
 * Spring has the capability to auto-detect the beans and register them as spring managed beans.
 *
 * To enable spring to perform auto-detect in XML based configuration, the following configuration needs to
 * be added.
 *  <context: component-scan base-packages="base.packages.with.spring.annotated.classes" />
 *
 *  To allows spring to identify the classes to auto-registered, classes need to decorated with
 *  following annotations :
 *
 *      1. @{@link org.springframework.stereotype.Component}
 *          This is a more generic stereotype annotation to indicate a class as component and
 *          aid in its auto-detection during component scanning
 *      2. @{@link org.springframework.stereotype.Service}
 *      3. @{@link org.springframework.stereotype.Repository}
 *      4. @{@link org.springframework.stereotype.Controller}
 *
 *  - @Repository, @Service and @Controller are more specialized stereotype annotations, that can are
 *     used to mark classes that hold specific logic.
 *
 *  - Also using these specialized could enable features that are used at runtime.
 *    For e.g. Adding @Repository on a class that interacts with database, enable automatic exception
 *    translation feature.
 *
 *
 *
 * */

package spring.xmlannotationconfig.componentscan.xml;