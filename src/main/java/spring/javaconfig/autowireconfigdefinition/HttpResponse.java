package spring.javaconfig.autowireconfigdefinition;

import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private Status status;
    private String message;

    private HttpResponse(Status status) {
        Assert.notNull(status,  "status cannot be null");
        this.status = status;
        this.message = this.status.statusDesc;
    }

    private HttpResponse(Status status, String message) {
        this(status);
        this.message = message == null? status.statusDesc : message;
    }

    public Status getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public enum Status {
        OK(200, "OK"),
        NOT_FOUND(404, "Not Found"),
        BAD_REQUEST(400, "Bad Request"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error");

        private static final Map<Integer, Status> STATUS_CODE_MAP =
                new HashMap<>();

        static {
            STATUS_CODE_MAP.put(OK.statusCode, OK);
            STATUS_CODE_MAP.put(NOT_FOUND.statusCode, NOT_FOUND);
            STATUS_CODE_MAP.put(BAD_REQUEST.statusCode, BAD_REQUEST);
            STATUS_CODE_MAP.put(INTERNAL_SERVER_ERROR.statusCode, INTERNAL_SERVER_ERROR);
        }

        private final int statusCode;
        private final String statusDesc;

        Status(int statusCode, String statusDesc) {
            this.statusCode = statusCode;
            this.statusDesc = statusDesc;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getStatusDesc() {
            return statusDesc;
        }

        public static Status getStatus(int statusCode) {
            return STATUS_CODE_MAP.get(statusCode);
        }
    }

    public static class ResponseBuilder {
        private int statusCode;
        private String statusDesc;

        public ResponseBuilder(int statusCode) {
            this.statusCode = statusCode;
        }

        public ResponseBuilder statusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }

        public HttpResponse build() {
            HttpResponse response =
                    new HttpResponse(Status.getStatus(this.statusCode),
                            this.statusDesc);
            return response;
        }
    }

}