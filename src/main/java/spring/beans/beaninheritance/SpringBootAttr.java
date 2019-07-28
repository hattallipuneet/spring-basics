package spring.beans.beaninheritance;

public class SpringBootAttr {

    private String debug;

    private String trace;

    private String applicationName;

    private String applicationAdminEnabled;

    private String loggingFile;

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationAdminEnabled() {
        return applicationAdminEnabled;
    }

    public void setApplicationAdminEnabled(String applicationAdminEnabled) {
        this.applicationAdminEnabled = applicationAdminEnabled;
    }

    public String getLoggingFile() {
        return loggingFile;
    }

    public void setLoggingFile(String loggingFile) {
        this.loggingFile = loggingFile;
    }
}
