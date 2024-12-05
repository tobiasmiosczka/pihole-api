package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractRequestBuilder<T> {

    private final ClientWrapper client;
    private final Map<String, String> parameters = new HashMap<>();
    private final Class<T> tClass;

    public AbstractRequestBuilder(ClientWrapper client, Class<T> tClass) {
        this.client = client;
        this.tClass = tClass;
    }

    protected void setParameter(String key) {
        this.parameters.put(key, "true");
    }

    protected void setParameter(String key, long value) {
        setParameter(key, String.valueOf(value));
    }

    protected void setParameter(String key, String value) {
        parameters.put(key, value);
    }

    public CompletableFuture<T> async() {
        return client.getAsync(parameters, tClass);
    }

    public T execute() throws ExecutionException, InterruptedException {
        return async().get();
    }

    public T execute(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        return async().get(timeout, unit);
    }
}
