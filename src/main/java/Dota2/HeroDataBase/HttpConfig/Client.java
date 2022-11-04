package Dota2.HeroDataBase.HttpConfig;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class Client {

    public String getBody() throws IOException, InterruptedException {
        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.dota2.com/datafeed/herodata?language=english&hero_id=92"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        return body;
    }
}
