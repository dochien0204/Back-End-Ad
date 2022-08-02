package com.example.demo3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Most {
    @JsonProperty("w:document")
    private Document document;
}
