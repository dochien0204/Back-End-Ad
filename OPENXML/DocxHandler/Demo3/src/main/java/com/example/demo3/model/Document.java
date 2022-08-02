package com.example.demo3.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Document {

    @JsonProperty("w:body")
    private Body body;

    @JsonProperty("xmlns:wpc")
    private String wpc;

    @JsonProperty("xmlns:mc")
    private String mc;

    @JsonProperty("xmlns:wp14")
    private String wp14;

    @JsonProperty("xmlns:m")
    private String m;
    @JsonProperty("xmlns:o")
    private String o;
    @JsonProperty("xmlns:w10")
    String w10;
    @JsonProperty("xmlns:r")
    String r;
    @JsonProperty("xmlns:w14")
    String w14;
    @JsonProperty("xmlns:wps")
    String wps;
    @JsonProperty("xmlns:w15")
    String w15;
    @JsonProperty("xmlns:w")
    String w;
    @JsonProperty("xmlns:wpi")
    String wpi;
    @JsonProperty("xmlns:v")
    String v;
    @JsonProperty("xmlns:wpg")
    String wpg;
    @JsonProperty("xmlns:wne")
    String wne;
    @JsonProperty("xmlns:cx")
    String cx;
    @JsonProperty("xmlns:w16se")
    String w16se;
    @JsonProperty("xmlns:wp")
    String wp;

    @JsonProperty("mc:Ignorable")
    String ignore;


}
