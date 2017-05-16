package example.client;

public class HttpClient implements Client {

    private String url;
    private String basePath;

    public HttpClient(String url, String basePath) {
        this.url = url;
        this.basePath = basePath;
    }

    @Override
    public String sendMessage(String name) {
//TODO remove unused url and basePath code smells
//        if (url == null || basePath == null) {
//            throw new IllegalStateException();
//        }
        return "Hello " + name;
    }
}
