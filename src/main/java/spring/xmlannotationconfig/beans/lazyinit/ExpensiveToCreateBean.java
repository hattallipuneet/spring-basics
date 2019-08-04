package spring.xmlannotationconfig.beans.lazyinit;

public class ExpensiveToCreateBean {

    public ExpensiveToCreateBean() {
        System.out.println("Bean initialized");
    }
}
