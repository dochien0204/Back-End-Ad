package com.example.demo3.utils;

import com.example.demo3.zip.Unzipper;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class ReadFile {
    public String convertXmlToJson() throws IOException {
        Unzipper unzipper = new Unzipper();
        String sourceFile = "C:\\JAVA BACK-END\\OPENXML\\DocxHandler\\Docfile.docx";
        File file = new File(sourceFile);
        InputStream inputStream = unzipper.getStreamDocumentXml(file);
        String text = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines()
                .collect(Collectors.joining("\n"));
        System.out.println(text);


        JSONObject jsonObject = XML.toJSONObject(text);
        String jsonString = jsonObject.toString(4);
        System.out.println(jsonString);
        return jsonString;
    }
}
