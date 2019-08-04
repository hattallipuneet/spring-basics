package spring.xmlannotationconfig.beans.servicelocator;

public class HttpService implements IService {

    @Override
    public String process() {
        System.out.println("Processing request");
        return "Request Processed";
    }
}
