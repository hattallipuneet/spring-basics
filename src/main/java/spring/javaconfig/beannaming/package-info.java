/**
 * Class definition in this packages demonstrate the way to specify bean names in
 * java based container configuration.
 *
 * By default, the IOC container will use the method name as the bean name if the
 * @{link #name} attribute of {@link org.springframework.context.annotation.Bean} annotation.
 *
 *
 * The name attribute can be specified as below :
 *
 *      @Bean(name = "beanName")
 *      public <RETURN_TYPE> method_name() {
 *          // instantiate and return bean
 *      }
 *
 *  The name attribute also takes an array of names.
 *
 *      @Bean(name = {"name1", "name2"})
 *      public <RETURN_TYPE> method_name() {
 *          // instantiate and return bean
 *      }
 *
 *
 *
 * */

package spring.javaconfig.beannaming;