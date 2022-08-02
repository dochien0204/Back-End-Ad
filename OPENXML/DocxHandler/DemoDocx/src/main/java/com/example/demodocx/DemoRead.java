package com.example.demodocx;

import com.example.demodocx.zip.Unzipper;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Service
public class DemoRead {

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
