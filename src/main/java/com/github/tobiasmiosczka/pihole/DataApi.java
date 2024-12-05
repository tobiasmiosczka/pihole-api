package com.github.tobiasmiosczka.pihole;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.request.*;

import java.time.LocalDateTime;

public class DataApi {

    private final ClientWrapper client;
    private final LocalDateTime from;
    private final LocalDateTime until;

    public DataApi(ClientWrapper client, LocalDateTime from, LocalDateTime until) {
        this.client = client;
        this.from = from;
        this.until = until;
    }

    public GraphDataRequestBuilder graphData() {
        return new GraphDataRequestBuilder(client, from, until);
    }

    public QueryLogRequestBuilder queryLog() {
        return new QueryLogRequestBuilder(client, from, until);
    }

    public TopClientsRequestBuilder topClients() {
        return new TopClientsRequestBuilder(client, from, until);
    }

    public TopDomainsRequestBuilder topDomains() {
        return new TopDomainsRequestBuilder(client, from, until);
    }

    public TopAdsRequestBuilder topRequests() {
        return new TopAdsRequestBuilder(client, from, until);
    }
}
