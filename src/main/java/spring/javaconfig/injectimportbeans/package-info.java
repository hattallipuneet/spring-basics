/**
 * Class definitions in this package demonstrate how to inject beans from imported other
 * container definitions.
 *
 * The simple technique used here is to define these dependencies as parameters of {@link org.springframework.context.annotation.Bean}
 * annotated factory method.
 *
 * Note: [CAUTIONARY WARNING]
 *      Another technique used for injecting imported beans is to use the @Autowire annotation to
 *      inject the dependency into the config class. Then this dependency bean can used to in @Bean
 *      annotated methods that create desired bean.
 *
 * */
package spring.javaconfig.injectimportbeans;