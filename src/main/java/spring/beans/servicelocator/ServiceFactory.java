package spring.beans.servicelocator;

public interface ServiceFactory {
    IService getService(String serviceName);
}
