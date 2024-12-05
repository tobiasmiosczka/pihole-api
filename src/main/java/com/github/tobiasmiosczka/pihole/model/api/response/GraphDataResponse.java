package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.tobiasmiosczka.pihole.serialization.InstantKeyDeserializer;

import java.time.Instant;
import java.util.Map;

public class GraphDataResponse {

    @JsonProperty("ads_over_time")
    @JsonDeserialize(keyUsing = InstantKeyDeserializer.class)
    private Map<Instant, Integer> adsOverTime;

    @JsonProperty("domains_over_time")
    @JsonDeserialize(keyUsing = InstantKeyDeserializer.class)
    private Map<Instant, Integer> domainsOverTime;

    public GraphDataResponse() {
    }

    public Map<Instant, Integer> getAdsOverTime() {
        return adsOverTime;
    }

    public void setAdsOverTime(Map<Instant, Integer> adsOverTime) {
        this.adsOverTime = adsOverTime;
    }

    public Map<Instant, Integer> getDomainsOverTime() {
        return domainsOverTime;
    }

    public void setDomainsOverTime(Map<Instant, Integer> domainsOverTime) {
        this.domainsOverTime = domainsOverTime;
    }
}
