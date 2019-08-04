/**
 * Classes in this package demonstrate use of @{@link org.springframework.context.annotation.Import}
 * annotation to import one configuration class definition into another configuration class definition.
 *
 * @Import annotation takes an array of {@link java.lang.Class} as value.
 *
 *      @Configuration
 *      @Import({ DaoConfig.class, ServiceConfig.class})
 *      public class AppResourceConfig {
 *
 *      }
 *
 *      @Configuration
 *      public class DaoConfig {
 *
 *      }
 *
 *      @Configuration
 *      public class ServiceConfig {
 *
 *      }
 *
 * @see org.springframework.context.annotation.Import
 * @see org.springframework.context.annotation.Configuration
 *
 * */
package spring.javaconfig.configurationimport;