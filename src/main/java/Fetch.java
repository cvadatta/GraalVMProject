import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;

public class Fetch {
    public void post(String uri, String data) throws Exception {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .POST(HttpRequest.BodyProcessor.fromFile(
                        Paths.get("src\\main\\resources\\fetch.js")))
                .build();

        HttpResponse<?> response = client.send(request, HttpResponse.BodyHandlers.discarding());
        System.out.println(response.statusCode());





}
