package com.github.tobiasmiosczka.pihole.model.submodels;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class Query {

    @JsonProperty(index = 0)
    private Instant time;

    @JsonProperty(index = 1)
    private String type;

    @JsonProperty(index = 2)
    private String domain;

    @JsonProperty(index = 3)
    private String client;

    @JsonProperty(index = 4)
    private QueryStatus status;

    @JsonProperty(index = 5)
    private String source;

    @JsonProperty(index = 6)
    private int reply;

    @JsonProperty(index = 7)
    private float responseTime;

    @JsonProperty(index = 8)
    private DnssecStatus dnssecStatus;

    public Query() {
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public QueryStatus getStatus() {
        return status;
    }

    public void setStatus(QueryStatus status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getReply() {
        return reply;
    }

    public void setReply(int reply) {
        this.reply = reply;
    }

    public float getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(float responseTime) {
        this.responseTime = responseTime;
    }

    public DnssecStatus getDnssecStatus() {
        return dnssecStatus;
    }

    public void setDnssecStatus(DnssecStatus dnssecStatus) {
        this.dnssecStatus = dnssecStatus;
    }
}
