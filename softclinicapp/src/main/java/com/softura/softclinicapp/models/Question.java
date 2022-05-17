package com.softura.softclinicapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private int questionNo;
    private String questionText;
    private Answer[] answer;
    private int correctAnswer;
}
