package spring.xmlannotationconfig.beans.servicelocator;

import org.springframework.beans.factory.annotation.Autowired;

public class UserResource {

    @Autowired
    private ServiceFactory serviceFactory;

    public String handleRequest() {
        IService service = serviceFactory.getService("httpService");
        System.out.println("handling request");
        return service.process();
    }
}
