package com.github.tobiasmiosczka.pihole.client;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

public interface Client {

    <T> CompletableFuture<T> getAsync(URI uri, Class<T> tClass);
}
