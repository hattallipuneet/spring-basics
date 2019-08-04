package spring.xmlannotationconfig.javaconfig;

public class JdbcDataSource implements DataSource {

    private String url;

    private String username;

    private String password;

    public JdbcDataSource() {

    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("PROPS [ %s %s %s ]", this.url, this.username, this.password);
    }
}
