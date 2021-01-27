package io.disshell.BlitzSpring.DAO;

import io.disshell.BlitzSpring.model.Question;

import java.io.IOException;
import java.util.List;

public interface QuestionDAO {
    List<Question> getAll() throws IOException;
}
