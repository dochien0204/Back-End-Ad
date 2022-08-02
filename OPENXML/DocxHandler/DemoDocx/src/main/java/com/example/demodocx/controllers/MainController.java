package com.example.demodocx.controllers;


import com.example.demodocx.DemoRead;
import com.example.demodocx.service.IJsonString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/")
public class MainController {

    @Autowired
    private IJsonString jsonString;

    @GetMapping("/home")
    public ResponseEntity<?> getDefault()
    {
        return ResponseEntity.status(200).body("Hello");
    }

//    @GetMapping("/string")
//    public ResponseEntity<?> getJsonString() throws IOException
//    {
//        DemoRead demoRead = new DemoRead();
//        return ResponseEntity.status(200).body(demoRead.convertXmlToJson());
//    }
}
