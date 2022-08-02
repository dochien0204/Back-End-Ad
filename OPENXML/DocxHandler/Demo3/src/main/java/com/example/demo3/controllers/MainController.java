package com.example.demo3.controllers;


import com.example.demo3.model.Most;
import com.example.demo3.services.impl.IJsonString;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private IJsonString jsonString;
    @GetMapping
    public ResponseEntity<?> getJsonString() throws IOException {
        return ResponseEntity.status(200).body(jsonString.JsonString());
    }

    @GetMapping("/hello")
    public  ResponseEntity<?> get() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Most most = objectMapper.readValue(jsonString.JsonString(), Most.class);
        return ResponseEntity.status(200).body(most.getDocument());
    }

}
