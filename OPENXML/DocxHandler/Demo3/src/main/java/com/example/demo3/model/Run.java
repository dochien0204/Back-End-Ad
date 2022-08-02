package com.example.demo3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Run {

    @JsonProperty("w:rPr")
    private RunProperties runProperties;

    private List<Text> textList;
}
