package spring.xmlannotationconfig.beans.lazyinit;

public class AnotherBean {

    public AnotherBean() {
        System.out.println(AnotherBean.class.getSimpleName() + " Bean is initialized");
    }
}
