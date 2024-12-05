package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;

import java.time.LocalDateTime;

import static java.time.ZoneOffset.UTC;

public class AbstractTimeBasedRequestBuilder<T> extends AbstractRequestBuilder<T> {

    public AbstractTimeBasedRequestBuilder(ClientWrapper client, Class<T> tClass, LocalDateTime from, LocalDateTime until) {
        super(client, tClass);
        setParameter("from", from.toEpochSecond(UTC));
        setParameter("until", until.toEpochSecond(UTC));
    }
}
