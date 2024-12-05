package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.TopAdsResponse;

import java.time.LocalDateTime;

public class TopAdsRequestBuilder extends AbstractTimeBasedRequestBuilder<TopAdsResponse> {

    public TopAdsRequestBuilder(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        super(client, TopAdsResponse.class, from, until);
        setParameter("topAds");
    }
}
