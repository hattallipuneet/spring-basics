package spring.javaconfig.springprofiles;

public class DataSource {

    private String sourceString;

    public DataSource(String sourceString) {
        this.sourceString = sourceString;
    }

    public String getSourceString() {
        return sourceString;
    }

    public void setSourceString(String sourceString) {
        this.sourceString = sourceString;
    }
}
