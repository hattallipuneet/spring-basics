package spring.javaconfig.injectimportbeans;

import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.UUID;

public class JdbcAccountRepository implements AccountRepository {

    private DataSource dataSource;

    public JdbcAccountRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @PostConstruct
    public void init() throws Exception {
        Assert.notNull(this.dataSource, "DataSource uninitialized");
    }

    @Override
    public String fetchAccountId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public String transfer() {
        return UUID.randomUUID().toString();
    }
}