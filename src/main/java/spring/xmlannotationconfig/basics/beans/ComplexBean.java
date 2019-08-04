package spring.xmlannotationconfig.basics.beans;


/**
 * {@link ComplexBean} class here is used to demonstrate a bean which has complex dependencies.
 * By complex dependencies we mean, these dependencies are of object types.
 *
 * This class will be used to demonstrate the constructor injection method.
 *
 * For example of bean with primitive type dependencies check {@link ScalarValueBean}
 *
 *
 * @author phattall
 * @see ScalarValueBean
 * */

public class ComplexBean {
    private ScalarValueBean scalarValueBean;
    private boolean complexBean;

    public ComplexBean(ScalarValueBean scalarValueBean, boolean complexBean) {
        this.scalarValueBean = scalarValueBean;
        this.complexBean = complexBean;
    }

    public ScalarValueBean getScalarValueBean() {
        return scalarValueBean;
    }

    public void setScalarValueBean(ScalarValueBean scalarValueBean) {
        this.scalarValueBean = scalarValueBean;
    }

    public boolean isComplexBean() {
        return complexBean;
    }

    public void setComplexBean(boolean complexBean) {
        this.complexBean = complexBean;
    }
}
