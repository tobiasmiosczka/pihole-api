package com.github.tobiasmiosczka.pihole.model.submodels;

import com.fasterxml.jackson.annotation.JsonValue;

public enum QueryStatus {
    BLOCKED_BY_GRAVITY(1, "Blocked (gravity)"),
    OK(2, "Ok"),
    CACHED(3, "Cached"),
    REGEX_BLACKLIST(4, "Regex Blacklist"),
    EXACT_BLACKLIST(5, "Exact Blacklist"),
    BLOCKED_EXTERNAL_IP(6, "Blocked (external, IP)"),
    BLOCKED_EXTERNAL_NULL(7, "Blocked (external, null)"),
    BLOCKED_EXTERNAL_RXNA(8, "Blocked (external, RXNA)"),
    BLOCKED_GRAVITY_CNAME(9, "Blocked (gravity, CNAME)"),
    BLOCKED_REGEX_BLACKLIST_CNAME(10, "Blocked (regex blacklist, CNAME)"),
    BLOCKED_EXACT_BLACKLIST_CNAME(11, "Blocked (exact blacklist, CNAME)"),
    RETRIED(12, "Retried"),
    RETIRED_IGNORED(13, "Retired (ignored)"),
    OK_ALREADY_FORWARDED(14, "Ok (already forward)"),
    BLOCKED_DATABASE_IS_BUSY(15, "Blocked (database is busy)"),
    BLOCKED_SPECIAL_DOMAIN(16, "Blocked (special domain)"),
    OK_STALE_CACHE(17, "Ok (stale cache)");


    private final int id;
    private final String name;

    QueryStatus(int id, String name) {
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
