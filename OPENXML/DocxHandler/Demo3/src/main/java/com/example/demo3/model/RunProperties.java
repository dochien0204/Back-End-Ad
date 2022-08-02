package com.example.demo3.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RunProperties {

    @JsonProperty("w:b")
    private boolean bold;

    @JsonProperty("w:u")
    private String underline;

    @JsonProperty("w:i")
    private boolean italic;

    @JsonProperty("w:strike")
    private String strike;
}
