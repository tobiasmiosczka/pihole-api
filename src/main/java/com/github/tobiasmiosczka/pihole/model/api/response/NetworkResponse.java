package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.tobiasmiosczka.pihole.model.submodels.Network;

import java.util.List;

public class NetworkResponse {

    @JsonProperty("network")
    private List<Network> networks;

    public NetworkResponse() {
    }

    public List<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(List<Network> networks) {
        this.networks = networks;
    }
}
