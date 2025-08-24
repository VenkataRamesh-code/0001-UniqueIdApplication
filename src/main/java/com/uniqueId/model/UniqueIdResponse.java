package com.uniqueId.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniqueIdResponse {
    private String uniqueId;

    private String Id;

    public UniqueIdResponse() {}

    public UniqueIdResponse(String uniqueId, String Id) {
        this.uniqueId = uniqueId;
        this.Id = Id;
    }
}