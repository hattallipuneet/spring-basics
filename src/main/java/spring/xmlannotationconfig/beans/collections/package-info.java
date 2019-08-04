/**
 * Examples in this package demonstrate defining the collection properties of a spring bean.
 *
 * This will introduce the following tags for each of the collections :
 *
 * {@link java.util.List} :
 *      <list>
 *          <value></value>
 *          <ref bean=""/>
 *      </list>
 *
 *  {@link java.util.Set} :
 *      <set>
 *          <value></value>
 *          <ref bean="" />
 *      </set>
 *
 *  {@link java.util.Map} :
 *      <map>
 *          <entry key="" value="" />
 *          <entry key-ref="" value-ref=""/>
 *      </map>
 *
 *  {@link java.util.Properties} :
 *
 *      <props>
 *          <prop key="">value</prop>
 *          <prop key="">value</prop>
 *          <prop key="">value</prop>
 *      </props>
 *
 *
 * Collections defined as properties of the bean support concept of merging.
 * This concept is similar to inheritance in OOP. Merging can be achieved as follows :
 *
 *
 *  <bean id="parentBean" class="FQCN">
 *     <property name="properties">
 *         <props>
 *             <prop key="p1">v1</prop>
 *             <prop key="p2">v2</prop>
 *             <prop key="p3">v3</prop>
 *         </props>
 *     </property>
 *  </bean>
 *
 *  <bean id="childBean" parent="parentBean" class="FQCN">
 *      <property name="properties">
 *          <props merge="true">
 *               <!-- Here properties p1 and p2 get inherited by virtue of merge -->
 *               <!-- p3 has been overridden -->
 *              <prop key="p3">v3</prop>
 *              <!-- New properties p4 and p5 have been added -->
 *              <prop key="p4">v4</prop>
 *              <prop key="p5">v5</prop>
 *          </props>
 *      </property>
 *  </bean>
 *
 * */

package spring.xmlannotationconfig.beans.collections;