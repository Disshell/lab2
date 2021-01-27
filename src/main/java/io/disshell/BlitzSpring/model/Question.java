package io.disshell.BlitzSpring.model;

import lombok.Data;

@Data
public class Question {
    private int id;
    private String question;
    private String option;
    private String answer;

    public Question(int id) {
        this.id = id;
    }
}
