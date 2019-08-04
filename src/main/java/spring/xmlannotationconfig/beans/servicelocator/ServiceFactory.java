package spring.xmlannotationconfig.beans.servicelocator;

public interface ServiceFactory {
    IService getService(String serviceName);
}
