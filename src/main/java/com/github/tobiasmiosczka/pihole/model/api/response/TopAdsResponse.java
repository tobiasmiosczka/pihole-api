package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TopAdsResponse {

    @JsonProperty("top_ads")
    private Map<String, String> topAds;

    public TopAdsResponse() {
    }

    public Map<String, String> getTopAds() {
        return topAds;
    }

    public void setTopAds(Map<String, String> topAds) {
        this.topAds = topAds;
    }
}
