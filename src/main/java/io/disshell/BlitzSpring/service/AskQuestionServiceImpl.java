package io.disshell.BlitzSpring.service;

import io.disshell.BlitzSpring.DAO.QuestionDAO;
import io.disshell.BlitzSpring.model.Question;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@Service
public class AskQuestionServiceImpl implements AskQuestionService {
    private QuestionDAO questionDAO;
    private int Threshold;

    public AskQuestionServiceImpl(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
        this.Threshold = 4;
    }

    public void AskQuestion() throws IOException {
        List<Question> questions = questionDAO.getAll();
        int сorrect = 0;

        for (Question question : questions) {
            System.out.println(String.format("%s \n %s \n", question.getQuestion(), question.getOption()));
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            if(question.getAnswer().trim().equals(answer)) {
                сorrect++;
            }
        }
        if(сorrect >= Threshold) {
            System.out.println(String.format("Поздарвляе. Вы набрали %d из %d возможных", сorrect, questions.size()));
        } else {
            System.out.println(String.format("Сожалеем. Вы набрали %d из %d возможных", сorrect, questions.size()));
        }
    }
}
