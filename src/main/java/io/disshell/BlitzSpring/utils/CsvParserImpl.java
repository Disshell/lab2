package io.disshell.BlitzSpring.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvParserImpl implements CsvParser {
    public List<String[]> getFullQuestions() throws IOException {
        String file  = new String(Files.readAllBytes(ResourceUtils.getFile("classpath:Questions.csv").toPath()));
        String[] lines = file.split("\n");
        List<String[]> fullQuestions = new ArrayList<String[]>();
        for (int i = 0; i < lines.length; i++) {
            fullQuestions.add(lines[i].split(";"));
        }
        return fullQuestions;
    }
}
