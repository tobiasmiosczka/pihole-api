package com.github.tobiasmiosczka.pihole;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.request.*;

import java.time.LocalDateTime;

public class DataApi {

    private final ClientWrapper client;

    public DataApi(ClientWrapper client) {
        this.client = client;
    }

    public GraphDataRequestBuilder graphData(LocalDateTime from, LocalDateTime until) {
        return new GraphDataRequestBuilder(client, from, until);
    }

    public QueryLogRequestBuilder queryLog(LocalDateTime from, LocalDateTime until) {
        return new QueryLogRequestBuilder(client, from, until);
    }

    public TopClientsRequestBuilder topClients(LocalDateTime from, LocalDateTime until) {
        return new TopClientsRequestBuilder(client, from, until);
    }

    public TopDomainsRequestBuilder topDomains(LocalDateTime from, LocalDateTime until) {
        return new TopDomainsRequestBuilder(client, from, until);
    }

    public TopAdsRequestBuilder topRequests(LocalDateTime from, LocalDateTime until) {
        return new TopAdsRequestBuilder(client, from, until);
    }
}
