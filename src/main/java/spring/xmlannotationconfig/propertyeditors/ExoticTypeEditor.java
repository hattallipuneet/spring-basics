package spring.xmlannotationconfig.propertyeditors;

import java.beans.PropertyEditorSupport;

public class ExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("Converting " + text + " to object");
        setValue(new ExoticType(text.toUpperCase()));
    }

    @Override
    public String getAsText() {
        ExoticType exoticType = (ExoticType) this.getValue();
        return exoticType.getName();
    }
}
