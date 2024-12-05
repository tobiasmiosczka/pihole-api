package com.github.tobiasmiosczka.pihole.model.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.tobiasmiosczka.pihole.model.submodels.Query;

import java.util.List;

public class QueryLogResponse {

    @JsonProperty("data")
    private List<Query> data;

    public QueryLogResponse() {
    }

    public List<Query> getData() {
        return data;
    }

    public void setData(List<Query> data) {
        this.data = data;
    }
}
