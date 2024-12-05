package com.github.tobiasmiosczka.pihole.serialization;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

import java.time.Instant;

public class InstantKeyDeserializer extends KeyDeserializer {

    @Override
    public Object deserializeKey(String key, DeserializationContext context) {
        return Instant.ofEpochSecond(Long.parseLong(key));
    }
}