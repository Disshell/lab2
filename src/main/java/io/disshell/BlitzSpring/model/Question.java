package io.disshell.BlitzSpring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Question {
    private int id;
    private String question;
    private String option;
    private String answer;
}
