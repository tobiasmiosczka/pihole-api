package com.github.tobiasmiosczka.pihole.model.submodels;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DnssecStatus {
    NO_DNSSEC(0, "no DNSSEC"),
    SECURE(1, "Secure"),
    INSECURE(2, "Insecure"),
    BOGUS(3, "bogus"),
    ABANDONED(4, "abandoned"),
    UNKNOWN(5, "unknown");

    private final int id;
    private final String name;

    DnssecStatus(int id, String name) {
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
