package com.github.tobiasmiosczka.pihole.client;

import java.net.URI;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ClientWrapper {

    private static final String PATH_DB_API = "/admin/api_db.php";

    private final Client client;
    private final URI host;
    private final String apiKey;

    public ClientWrapper(Client client, URI host, String apiKey) {
        this.client = client;
        this.host = host;
        this.apiKey = apiKey;
    }

    public <T> CompletableFuture<T> getAsync(Map<String, String> parameters, Class<T> tClass) {
        URI uri = URI.create(host + PATH_DB_API + "?auth=" + apiKey + "&" + toQueryParameters(parameters));
        return client.getAsync(uri, tClass);
    }

    private static String toQueryParameters(Map<String, String> parameters) {
        return parameters.entrySet().stream()
                .filter(e -> Objects.nonNull(e.getValue()))
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining("&"));
    }
}
