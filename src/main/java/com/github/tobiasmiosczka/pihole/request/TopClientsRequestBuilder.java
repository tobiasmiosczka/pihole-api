package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.TopClientsResponse;

import java.time.LocalDateTime;

public class TopClientsRequestBuilder extends AbstractTimeBasedRequestBuilder<TopClientsResponse> {

    public TopClientsRequestBuilder(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        super(client, TopClientsResponse.class, from, until);
        setParameter("topClients");
    }
}
