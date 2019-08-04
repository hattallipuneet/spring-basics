package spring.javaconfig.autowireconfigdefinition;

import java.util.UUID;

public class BookingServiceImpl implements BookingService {

    private HttpClient httpClient;

    public BookingServiceImpl(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public String getBookingId() {
        return UUID.randomUUID().toString();
    }
}