package builder;

import java.util.HashMap;
import java.util.Map;

class HttpRequest {
    private final String url;
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;

    private HttpRequest(HttpBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParams = builder.queryParams;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParams +
                ", body='" + body + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class HttpBuilder {
        private final String url;
        private String method;
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParams = new HashMap<>();
        private String body;
        private int timeout;

        public HttpBuilder(String url) {
            this.url = url;
        }

        public HttpBuilder addMethod(String method) {
            this.method = method;
            return this;
        }

        public HttpBuilder addHead(String head, String val) {
            this.headers.put(head, val);
            return this;
        }

        public HttpBuilder addQuery(String query, String val) {
            this.queryParams.put(query, val);
            return this;
        }

        public HttpBuilder addBody(String body) {
            this.body = body;
            return this;
        }

        public HttpBuilder addTimeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}