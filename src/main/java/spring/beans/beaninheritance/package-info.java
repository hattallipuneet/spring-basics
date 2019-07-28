/**
 * Classes definitions on this package demonstrate the concept of bean inheritance in
 * while defining beans.
 *
 * A child bean definition inherits configuration data from parent definition. The child definition can
 * override configuration data and add new others.
 *
 * How to indicate parent-child bean while defining ?
 * <bean id="parentBean" class="com.bean.ParentBean"/>
 * <bean id="childBean" class="com.bean.ChildBean" parent="parentBean"/>
 *
 * The parent attribute of bean tag is used to specify the parent child relationship.
 *
 *
 * */

package spring.beans.beaninheritance;