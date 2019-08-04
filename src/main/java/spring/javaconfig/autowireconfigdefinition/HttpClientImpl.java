package spring.javaconfig.autowireconfigdefinition;

public class HttpClientImpl implements HttpClient {

    @Override
    public HttpResponse get(String url) {
        return new HttpResponse.ResponseBuilder(200)
                .statusDesc("OK").build();
    }
}