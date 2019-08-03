/**
 * Class definitions in this package demonstrate the lookup method injection technique
 * in Java based container configuration.
 *
 * Method loop-up injection is useful when a singleton scoped bean has a prototype scoped
 * bean. Through look-up method injection the singleton scoped bean is able to retrieve new
 * instance of the prototype scoped bean whenever its needed.
 *
 * */
package spring.javaconfig.methodlookup;