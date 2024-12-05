package com.github.tobiasmiosczka.pihole.request;

import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.model.api.response.NetworkResponse;

public class NetworkRequestBuilder extends AbstractRequestBuilder<NetworkResponse> {

    public NetworkRequestBuilder(ClientWrapper client) {
        super(client, NetworkResponse.class);
        setParameter("network");
    }
}
