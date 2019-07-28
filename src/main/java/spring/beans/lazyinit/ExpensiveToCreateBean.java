package spring.beans.lazyinit;

public class ExpensiveToCreateBean {

    public ExpensiveToCreateBean() {
        System.out.println("Bean initialized");
    }
}
