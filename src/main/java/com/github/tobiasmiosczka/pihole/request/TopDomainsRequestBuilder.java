package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.TopDomainsResponse;

import java.time.LocalDateTime;

public class TopDomainsRequestBuilder extends AbstractTimeBasedRequestBuilder<TopDomainsResponse> {

    public TopDomainsRequestBuilder(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        super(client, TopDomainsResponse.class, from, until);
        setParameter("topDomains");
    }
}
