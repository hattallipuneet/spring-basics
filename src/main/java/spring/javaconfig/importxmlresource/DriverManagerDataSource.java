package spring.javaconfig.importxmlresource;

public class DriverManagerDataSource implements DataSource {

    private String url;

    private String username;

    private String password;

    public DriverManagerDataSource(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("[ URL PROPS { %s %s %s }  ]", this.url, this.username, this.password);
    }
}