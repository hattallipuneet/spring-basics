package spring.javaconfig.beanscope;

import java.util.UUID;

public class Encryptor {

    public String encrypt() {
        return UUID.randomUUID().toString();
    }
}
