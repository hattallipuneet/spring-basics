package spring.xmlannotationconfig.javaconfig;

import java.util.UUID;

public class JdbcRepository implements Repository {

    private DataSource dataSource;

    public JdbcRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String save() {
        return UUID.randomUUID().toString();
    }
}
