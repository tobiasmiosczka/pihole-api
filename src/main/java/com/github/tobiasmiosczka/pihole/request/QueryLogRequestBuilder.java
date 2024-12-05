package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.QueryLogResponse;
import com.github.tobiasmiosczka.pihole.model.submodels.QueryStatus;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class QueryLogRequestBuilder extends AbstractTimeBasedRequestBuilder<QueryLogResponse> {

    public QueryLogRequestBuilder(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        super(client, QueryLogResponse.class, from, until);
        setParameter("getAllQueries");
    }

    public QueryLogRequestBuilder withStatus(Set<QueryStatus> status) {
        String string = status.stream()
                .map(e -> String.valueOf(e.getId()))
                .collect(Collectors.joining(","));
        setParameter("status", string);
        return this;
    }
}
