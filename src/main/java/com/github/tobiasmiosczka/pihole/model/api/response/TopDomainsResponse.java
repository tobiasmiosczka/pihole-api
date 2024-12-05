package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TopDomainsResponse {

    @JsonProperty("top_domains")
    private Map<String, String> topDomains;

    public TopDomainsResponse() {
    }

    public Map<String, String> getTopDomains() {
        return topDomains;
    }

    public void setTopDomains(Map<String, String> topDomains) {
        this.topDomains = topDomains;
    }
}
