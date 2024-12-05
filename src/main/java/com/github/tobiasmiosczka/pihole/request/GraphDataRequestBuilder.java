package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.GraphDataResponse;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GraphDataRequestBuilder extends AbstractTimeBasedRequestBuilder<GraphDataResponse> {

    public GraphDataRequestBuilder(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        super(client, GraphDataResponse.class, from, until);
        setParameter("getGraphData");
    }

    public GraphDataRequestBuilder withInterval(long amount, ChronoUnit unit) {
        return this.withInterval(Duration.of(amount, unit));
    }

    public GraphDataRequestBuilder withInterval(Duration interval) {
        setParameter("duration", interval.toSeconds());
        return this;
    }
}
