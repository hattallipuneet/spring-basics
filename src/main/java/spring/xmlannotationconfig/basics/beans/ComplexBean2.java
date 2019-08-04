package spring.xmlannotationconfig.basics.beans;

/**
 * This class is used to demonstrate the constructor dependency injection technique for a class
 * where multiple dependencies are of same type.
 */
public class ComplexBean2 {
    private ScalarValueBean bean1;
    private ScalarValueBean bean2;

    public ComplexBean2(ScalarValueBean bean1, ScalarValueBean bean2) {
        this.bean1 = bean1;
        this.bean2 = bean2;
    }

    public ScalarValueBean getBean1() {
        return bean1;
    }

    public ScalarValueBean getBean2() {
        return bean2;
    }

    public void setBean1(ScalarValueBean bean1) {
        this.bean1 = bean1;
    }

    public void setBean2(ScalarValueBean bean2) {
        this.bean2 = bean2;
    }
}
