package com.uniqueId.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Idgenerator {
    private String Id;
    public UUID getId() {
        return UUID.randomUUID();
    }
}
