package com.github.tobiasmiosczka.pihole.model.submodels;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ReplyTypes {
    N_A(0, "N/A"),
    NODATA(1, "NODATA"),
    NXDOMAIN(2, "NXDOMAIN"),
    CNAME(3, "CNAME"),
    IP(4, "IP"),
    DOMAIN(5, "DOMAIN"),
    RRNAME(6, "RRNAME"),
    SERVFAIL(7, "SERVFAIL"),
    REFUSED(8, "REFUSED"),
    NOTIMP(9, "NOTIMP"),
    UPSTREAM_ERROR(10, "upstream error"),
    DNSSEC(11, "DNSSEC"),
    NONE(12, "NONE"),
    BLOB(13, "BLOB");

    private final int id;
    private final String name;

    ReplyTypes(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonValue
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
