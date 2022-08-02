package com.example.demodocx.service;


import org.springframework.stereotype.Service;

import java.io.IOException;

public interface IJsonString {
    String convertXmlToJson() throws IOException;
}
