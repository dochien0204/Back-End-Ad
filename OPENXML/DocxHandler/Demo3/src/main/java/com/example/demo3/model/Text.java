package com.example.demo3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Text {

    @JsonProperty("w:t")
    private String content;
}
