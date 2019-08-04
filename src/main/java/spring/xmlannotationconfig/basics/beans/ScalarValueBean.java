package spring.xmlannotationconfig.basics.beans;


/**
 * {@link ScalarValueBean} here is used to demonstrate a spring managed bean class with scalar dependencies.
 * By scalar we mean, the dependencies are of primitive type.
 * This bean has been registered as a spring managed bean.
 * Refer the resources/spring/application-context.xml file for corresponding spring bean definition.
 *
 * This class will be used to demonstrate the setter injection method.
 *
 * @author phattall
 * @see ComplexBean
 * */
public class ScalarValueBean {
    private int anInt;
    private boolean aBoolean;
    private float aFloat;
    private double aDouble;

    public ScalarValueBean() {

    }

    public int getAnInt() {
        return anInt;
    }

    public double getaDouble() {
        return aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }
}
