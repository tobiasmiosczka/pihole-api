package com.github.tobiasmiosczka.pihole.model.submodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.List;

public class Network {

    private long id;
    private String hwaddr;

    @JsonProperty("interface")
    private String interfaceName;

    private Instant firstSeen;

    private Instant lastQuery;

    private long numQueries;

    private String macVendor;

    @JsonProperty("aliasclient_id")
    private String aliasclienId;

    private List<String> ip;

    private List<String> name;

    public Network() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHwaddr() {
        return hwaddr;
    }

    public void setHwaddr(String hwaddr) {
        this.hwaddr = hwaddr;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public Instant getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Instant firstSeen) {
        this.firstSeen = firstSeen;
    }

    public Instant getLastQuery() {
        return lastQuery;
    }

    public void setLastQuery(Instant lastQuery) {
        this.lastQuery = lastQuery;
    }

    public long getNumQueries() {
        return numQueries;
    }

    public void setNumQueries(long numQueries) {
        this.numQueries = numQueries;
    }

    public String getMacVendor() {
        return macVendor;
    }

    public void setMacVendor(String macVendor) {
        this.macVendor = macVendor;
    }

    public String getAliasclienId() {
        return aliasclienId;
    }

    public void setAliasclienId(String aliasclienId) {
        this.aliasclienId = aliasclienId;
    }

    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }
}
