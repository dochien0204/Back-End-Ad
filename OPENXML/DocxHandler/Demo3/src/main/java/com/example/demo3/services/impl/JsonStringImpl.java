package com.example.demo3.services.impl;

import com.example.demo3.utils.ReadFile;
import com.example.demo3.zip.Unzipper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class JsonStringImpl implements IJsonString{
    @Override
    public String JsonString() throws IOException {
        ReadFile readFile = new ReadFile();
        return readFile.convertXmlToJson();
    }
}
