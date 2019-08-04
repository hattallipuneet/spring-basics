package spring.xmlannotationconfig.beans.autowire;

public class AutowiredBean {

    private DependencyBean dependencyBean;

    public AutowiredBean() {}

    public AutowiredBean(DependencyBean dependencyBean) {
        this.dependencyBean = dependencyBean;
    }

    public DependencyBean getDependencyBean() {
        return dependencyBean;
    }

    public void setDependencyBean(DependencyBean dependencyBean) {
        this.dependencyBean = dependencyBean;
    }
}
