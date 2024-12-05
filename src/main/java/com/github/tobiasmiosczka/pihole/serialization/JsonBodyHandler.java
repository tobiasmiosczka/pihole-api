package com.github.tobiasmiosczka.pihole.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodySubscriber;
import java.net.http.HttpResponse.ResponseInfo;

import static java.net.http.HttpResponse.BodySubscribers.mapping;
import static java.net.http.HttpResponse.BodySubscribers.ofString;
import static java.nio.charset.StandardCharsets.UTF_8;

public class JsonBodyHandler<T> implements HttpResponse.BodyHandler<T> {

    private final ObjectMapper objectMapper;

    private final Class<T> tClass;

    public static <T> JsonBodyHandler<T> BodyHandler(final Class<T> tClass) {
        return new JsonBodyHandler<>(tClass);
    }

    private JsonBodyHandler(final Class<T> tClass) {
        this.tClass = tClass;
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
    }

    @Override
    public BodySubscriber<T> apply(final ResponseInfo responseInfo) {
        return mapping(
                ofString(UTF_8),
                (String body) -> {
                    try {
                        return objectMapper.readValue(body, tClass);
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                });
    }

}