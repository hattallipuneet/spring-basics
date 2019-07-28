/* *
* Pros of annotation based config :
*   1. Config is short and concise.
*   2. Config is closer to actual source code, which provides better context information.
*
*  Pros of XMl based config :
*  1. Centralized config location.
*  2. It is not invasive as it does not touch source code.
*
*
*
*  Enabling annotation config support :
*  <context:annotation-config />
*
*  The above xml config will enable spring to auto-wire the beans automatically.
*
*  Adding the <context: annotation-config /> registers the following BeanPostProcessors :
*
*  org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor
*   - Responsible for auto-wiring beans with dependencies that are marked with @org.springframework.beans.factory.annotation.Autowired
*
*  org.springframework.context.annotation.CommonAnnotationBeanPostProcessor
*   - Responsible for executing methods annotated with @javax.annotation.PostConstruct and
*       @javax.annotation.PreDestroy.
*     It also processes @javax.annotation.Resource annotations.
*
*
*  @Autowired
*   - Annotation to indicate the dependency to be autowired.
*   - it can placed on
*       i.      Field
*       ii.     Constructor
*       iii.    Setter method
*       iv.     Methods with arbitrary names
*
*   - By default the @Autowired annotated dependencies are considered to be mandatory, the spring container
*       raises an exception if it not able to fulfill the dependency.
*
*   - The dependency can be made optional by specifying the attribute required=true in the annotation.
*
*
*
* */

package spring.annotationconfig;