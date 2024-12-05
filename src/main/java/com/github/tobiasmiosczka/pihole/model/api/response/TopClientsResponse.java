package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TopClientsResponse {

    @JsonProperty("top_sources")
    private Map<String, String> topSources;

    public TopClientsResponse() {
    }

    public Map<String, String> getTopSources() {
        return topSources;
    }

    public void setTopSources(Map<String, String> topSources) {
        this.topSources = topSources;
    }
}
