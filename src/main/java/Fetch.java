import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static com.ibm.icu.text.PluralRules.Operand.j;


public class Fetch {
    public CompletableFuture post(String uri, String data) throws Exception {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .POST(HttpRequest.BodyProcessor.fromString(data))
                .build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.discarding());
    }


    }
