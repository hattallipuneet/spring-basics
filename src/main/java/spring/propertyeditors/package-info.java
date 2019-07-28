/**
 *  Classes to demonstrate the use of property editors to inject beans/values that need special handling
 *  before being injected into the dependent bean.
 *
 *  What are property editors ?
 *      - Spring uses a concept of property editors to achieve conversion between Objects and String value.
 *
 *      - Registering the property editors with {@link org.springframework.beans.BeanWrapper} or the IOC container
 *        gives spring knowledge of how to convert properties to desired type.
 *
 *  Where does spring use the property editors ?
 *
 *      - When spring is creating instances based on XML bean configuration, setting the properties on the
 *        bean is done using the property editors.
 *        e.g. if string value of a property is a FQCN and the corresponding property is of {@link java.lang.Class}
 *             type, spring uses the ClassEditor to convert the string class name to Class Object.
 *
 *      - Parsing HTTP params and payload data in Spring MVC.
 *
 *
 *  What will we learn here ?
 *      1. How to create property editors that aid in conversion from string to object ?
 *          a. To create a property editor you extend the {@link java.beans.PropertyEditorSupport} class.
 *          b. Override the {@link java.beans.PropertyEditorSupport#setAsText(java.lang.String)} method
 *            to provide logic to convert the string input param to desired object.
 *
 *      2. How to configure te property editor on an {@link org.springframework.context.ApplicationContext} ?
 *          Property Editors in spring are configured using the {@link org.springframework.beans.factory.config.CustomEditorConfigurer}
 *
 *          a. Define a bean of type {@link org.springframework.beans.factory.config.CustomEditorConfigurer}
 *              i. Use the customEditors property to add the new property editor.
 *              ii. Use the propertyEditorRegistrars property to add the new property editor.
 *      3. What is the recommended way of registering the property editors ?
 *          The recommended way to registering the property editor is through the {@link org.springframework.beans.PropertyEditorRegistrar}
 *
 *          a. How to use the {@link org.springframework.beans.PropertyEditorRegistrar} ?
 *              PropertyEditorRegistrar is an interface. Create a class that implements the interface and
 *              override the registerCustomEditors() method.
 *
 *      4. Why PropertyEditorRegistrar is the recommended way of registering property editors ?
 *          a. If property editors are registered with PropertyEditorRegistrar, then it could be reused in
 *             different places. This makes the property editor available with {@link org.springframework.validation.DataBinder}.
 *
 *          b. A PropertyEditorRegistrar is expected to create new instances of property editor each time it needs to
 *              be used. This avoids the need for synchronization in case where they are not registered through
 *              PropertyEditorRegistrar.
 *
 *      5. Why adding property editors through the customEditors attribute is not recommended ?
 *          In this case, the spring might maintain only a single instance of the property editor and this might require
 *          synchronization while using it.
 *
 *      6. More on PropertyEditorRegistrar :
 *          a. It is an implementation of {@link org.springframework.beans.factory.config.BeanFactoryPostProcessor}
 *          b. It is useful to add support for additional property editors to an application context.
 *
 *
 *
 *
 *
 *
 *
 * @see org.springframework.beans.BeanWrapper
 * @see java.beans.PropertyEditor
 * @see org.springframework.beans.PropertyEditorRegistrar
 * @see java.beans.PropertyEditorSupport
 *
 * */

package spring.propertyeditors;