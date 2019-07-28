package spring.basics.beans;

public class ComplexBeanFactory {

    public static ComplexBean getComplexBean(ScalarValueBean valueBean, boolean isComplex) {
        ComplexBean complexBean = new ComplexBean(valueBean, isComplex);
        return complexBean;
    }

    public ComplexBean getBean(ScalarValueBean valueBean, boolean isComplex) {
        ComplexBean complexBean = new ComplexBean(valueBean, isComplex);
        return complexBean;
    }
}
