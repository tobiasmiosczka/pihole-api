package com.github.tobiasmiosczka.pihole;

import com.github.tobiasmiosczka.pihole.client.Client;
import com.github.tobiasmiosczka.pihole.client.ClientWrapper;
import com.github.tobiasmiosczka.pihole.client.java11.Java11Client;
import com.github.tobiasmiosczka.pihole.request.NetworkRequestBuilder;

import java.net.URI;

import static java.util.Objects.isNull;

public class PiHoleApi {

    public static class PiHoleApiBuilder {

        private Client client;
        private URI host;
        private String apiKey;

        public PiHoleApiBuilder withHost(String host) {
            this.host = URI.create(host);
            return this;
        }

        public PiHoleApiBuilder withApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public PiHoleApiBuilder withClient(Client client) {
            this.client = client;
            return this;
        }

        public PiHoleApi build() {
            if (isNull(host)) {
                throw new IllegalArgumentException("No host specified.");
            }
            if (isNull(apiKey)) {
                throw new IllegalArgumentException("No API key provided.");
            }
            if (isNull(client)) {
                client = new Java11Client();
            }
            return new PiHoleApi(client, host, apiKey);
        }
    }

    private final ClientWrapper client;

    private PiHoleApi(Client client, URI host, String apiKey) {
        this.client = new ClientWrapper(client, host, apiKey);
    }

    public static PiHoleApiBuilder builder() {
        return new PiHoleApiBuilder();
    }

    public DataApi longTermData() {
        return new DataApi(client);
    }

    public NetworkRequestBuilder network() {
        return new NetworkRequestBuilder(client);
    }
}
