package spring.javaconfig.injectimportbeans;

import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

public class TransferServiceImpl implements TransferService{

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @PostConstruct
    public void init() throws Exception {
        Assert.notNull(this.accountRepository, "Partially initialized");
    }

    @Override
    public String transfer() {
        return this.accountRepository.transfer();
    }
}