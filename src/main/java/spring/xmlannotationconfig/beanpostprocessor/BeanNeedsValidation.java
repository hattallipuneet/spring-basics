package spring.xmlannotationconfig.beanpostprocessor;

public class BeanNeedsValidation {

    private boolean isInitialized;

    public BeanNeedsValidation(boolean isInitialized) {
        this.isInitialized = isInitialized;
    }

    public void validateState() {
        System.out.println("Validating bean state");
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }
}
