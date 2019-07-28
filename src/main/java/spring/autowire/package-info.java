/**
 * Examples part of this packages illustrate following features in spring :
 *  1. @Autowire
 *      How to select primary bean for DI from multiple target dependency ?
 *          - using @Primary in Java based config.
 *          - using primary=true in XML based config.
 *
 *  2. @Autowire with @Qualifier annotation to narrow down the dependency resolution process
 *     by name.
 *
 *  3. Using @Resource annotation instead of @Autowire annotation.
 *      - @Autowire annotation is primarily by type dependency resolution.
 *        Even though, declaring @Qualifier("identifier") aids in narrowing the target dependency.
 *        But the Spring container still looks for target dependency within beans of declared dependency type.
 *
 *      - @Resource aids in resolving the dependencies by name, if none is found it will try to
 *        resolve by type.
 *
 *
 * a. @{@link org.springframework.beans.factory.annotation.Autowired} can be placed upon
 *      1. Field
 *      2. Constructor
 *      3. Setter Method
 *      4. Method with arbitrary method.
 *
 * b. Auto-wiring process will raise an error if dependencies marked as @Autowired cannot be satisfied.
 *    All @Autowired marked dependencies are treated as required by default.
 *
 * c. To make the dependency auto-wiring optional, it can specified with required=false attribute to indicate
 *    the optional.
 *
 * d. If a class declares multiple constructors, only of them can have the required=true attribute.
 *    In case of multiple constructors, the spring will choose the greediest constructor, the constructor with the most
 *    parameters.
 *
 *
 * e. By default, @Autowired resolves dependencies by type. To further narrow down the selection process,
 *    bean definition in XML can have the primary=true attribute. In case of indicating primary bean in Java based config
 *    the bean factory method is annotated with @{@link org.springframework.context.annotation.Primary}
 *
 * f. To aid the bean dependency resolution process further by name, @{@link org.springframework.beans.factory.annotation.Qualifier}
 *    annotation can be used to specify the target dependency.
 *
 * g. @Qualifier can be used at following places :
 *      1. Field
 *      2. Constructor/method arguments
 *
 * @see org.springframework.beans.factory.annotation.Autowired
 * @see org.springframework.context.annotation.Primary
 * @see javax.annotation.Resource
 * */

package spring.autowire;