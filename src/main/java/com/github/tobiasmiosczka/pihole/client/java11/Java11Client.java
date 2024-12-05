package com.github.tobiasmiosczka.pihole.client.java11;

import com.github.tobiasmiosczka.pihole.client.Client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static com.github.tobiasmiosczka.pihole.serialization.JsonBodyHandler.BodyHandler;

public class Java11Client implements Client {

    private final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();


    private HttpRequest request(final URI uri) {
        return HttpRequest.newBuilder()
                .header("Accept", "application/json")
                .version(HttpClient.Version.HTTP_2)
                .uri(uri)
                .GET()
                .build();
    }

    @Override
    public <T> CompletableFuture<T> getAsync(URI uri, Class<T> tClass) {
        return client.sendAsync(request(uri), BodyHandler(tClass))
                .thenApply(HttpResponse::body);
    }
}
