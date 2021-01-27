package io.disshell.BlitzSpring.utils;

import java.io.IOException;
import java.util.List;

public interface CsvParser {
    List<String[]> getFullQuestions() throws IOException;
}
