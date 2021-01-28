package io.disshell.BlitzSpring.DAO;

import io.disshell.BlitzSpring.model.Question;
import io.disshell.BlitzSpring.utils.CsvParser;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionDAOImpl implements QuestionDAO {
    private final CsvParser csvParserFile;
    private List<Question> questionsList;

    public QuestionDAOImpl(CsvParser csvParserFile) {
        this.csvParserFile = csvParserFile;
    }

    @Override
    public List<Question> getAll() throws IOException {
        List<String[]> fullQuestions = csvParserFile.getFullQuestions();
        questionsList = new ArrayList<>();
        int index = 0;
        for (String[] fullQuestion : fullQuestions) {
            questionsList.add(Question.builder()
                    .answer(fullQuestion[2])
                    .question(fullQuestion[0])
                    .id(index)
                    .option(fullQuestion[1])
                    .build());
            index++;
        }
        return questionsList;
    }
}
