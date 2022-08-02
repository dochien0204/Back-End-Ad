package com.example.demo3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParagraphProperties {

    @JsonProperty("w:rPr")
    private RunProperties runProperties;
}
